package org.northwind.repository;
import org.northwind.model.PurchaseOrder;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PurchaseOrderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PurchaseOrder.class)
@Transactional(readOnly = true)
public interface PurchaseOrderRepository extends DetachableJpaRepository<PurchaseOrder, Long>, PurchaseOrderRepositoryCustom {

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
     * @param employee
     * @return Long
     */
    long countByEmployee(CustomerOrder employee);
}
