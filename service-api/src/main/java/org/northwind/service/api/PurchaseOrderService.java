package org.northwind.service.api;
import org.northwind.model.PurchaseOrder;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PurchaseOrderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PurchaseOrder.class)
public interface PurchaseOrderService extends EntityResolver<PurchaseOrder, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return PurchaseOrder
     */
    PurchaseOrder findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param purchaseOrder
     */
    void delete(PurchaseOrder purchaseOrder);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<PurchaseOrder> save(Iterable<PurchaseOrder> entities);

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
     * @return PurchaseOrder
     */
    PurchaseOrder save(PurchaseOrder entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return PurchaseOrder
     */
    PurchaseOrder findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<PurchaseOrder> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<PurchaseOrder> findAll();

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
    Page<PurchaseOrder> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<PurchaseOrder> findByEmployee(CustomerOrder employee, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<PurchaseOrder> findByProduct(Product product, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @return Long
     */
    long countByEmployee(CustomerOrder employee);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @return Long
     */
    long countByProduct(Product product);
}
