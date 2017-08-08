package org.northwind.service.api;
import org.northwind.model.OrderDetail;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = OrderDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OrderDetail.class)
public interface OrderDetailService extends EntityResolver<OrderDetail, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return OrderDetail
     */
    OrderDetail findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param orderDetail
     */
    void delete(OrderDetail orderDetail);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<OrderDetail> save(Iterable<OrderDetail> entities);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    void delete(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return OrderDetail
     */
    OrderDetail save(OrderDetail entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return OrderDetail
     */
    OrderDetail findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<OrderDetail> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<OrderDetail> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    long count();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<OrderDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<OrderDetail> findByCustomerOrder(CustomerOrder customerOrder, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<OrderDetail> findByProduct(Product product, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @return Long
     */
    long countByCustomerOrder(CustomerOrder customerOrder);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @return Long
     */
    long countByProduct(Product product);
}
