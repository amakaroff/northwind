package org.northwind.service.api;
import org.northwind.model.Product;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.Category;
import org.northwind.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProductService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Product.class)
public interface ProductService extends EntityResolver<Product, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Product
     */
    Product findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     */
    void delete(Product product);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Product> save(Iterable<Product> entities);

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
     * @return Product
     */
    Product save(Product entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Product
     */
    Product findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Product> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Product> findAll();

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
    Page<Product> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param orderDetailsToAdd
     * @return Product
     */
    Product addToOrderDetails(Product product, Iterable<Long> orderDetailsToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param orderDetailsToRemove
     * @return Product
     */
    Product removeFromOrderDetails(Product product, Iterable<Long> orderDetailsToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param orderDetails
     * @return Product
     */
    Product setOrderDetails(Product product, Iterable<Long> orderDetails);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param purchaseOrdersToAdd
     * @return Product
     */
    Product addToPurchaseOrders(Product product, Iterable<Long> purchaseOrdersToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param purchaseOrdersToRemove
     * @return Product
     */
    Product removeFromPurchaseOrders(Product product, Iterable<Long> purchaseOrdersToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param purchaseOrders
     * @return Product
     */
    Product setPurchaseOrders(Product product, Iterable<Long> purchaseOrders);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Product> findByCategory(Category category, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Product> findBySupplier(Supplier supplier, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     * @return Long
     */
    long countByCategory(Category category);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @return Long
     */
    long countBySupplier(Supplier supplier);

    /**
     * TODO Auto-generated method documentation
     *
     * @param discontinued
     * @param pageable
     * @return Page
     */
    Page<Product> findByDiscontinuedOrderByNameAsc(Boolean discontinued, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param discontinued
     * @return Long
     */
    long countByDiscontinuedOrderByNameAsc(Boolean discontinued);
}
