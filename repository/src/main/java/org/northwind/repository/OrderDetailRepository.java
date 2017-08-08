package org.northwind.repository;
import org.northwind.model.OrderDetail;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * = OrderDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OrderDetail.class)
@Transactional(readOnly = true)
public interface OrderDetailRepository extends DetachableJpaRepository<OrderDetail, Long>, OrderDetailRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @return Long
     */
    long countByProduct(Product product);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @return Long
     */
    long countByCustomerOrder(CustomerOrder customerOrder);
}
