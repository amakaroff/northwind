// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.service.api;

import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.northwind.model.Supplier;
import org.northwind.service.api.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ProductService_Roo_Service {
    
    declare parents: ProductService extends EntityResolver<Product, Long>;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Product
     */
    public abstract Product ProductService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     */
    public abstract void ProductService.delete(Product product);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<Product> ProductService.save(Iterable<Product> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ProductService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Product
     */
    public abstract Product ProductService.save(Product entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Product
     */
    public abstract Product ProductService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<Product> ProductService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<Product> ProductService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ProductService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param orderDetailsToAdd
     * @return Product
     */
    public abstract Product ProductService.addToOrderDetails(Product product, Iterable<Long> orderDetailsToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param orderDetailsToRemove
     * @return Product
     */
    public abstract Product ProductService.removeFromOrderDetails(Product product, Iterable<Long> orderDetailsToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param orderDetails
     * @return Product
     */
    public abstract Product ProductService.setOrderDetails(Product product, Iterable<Long> orderDetails);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param purchaseOrdersToAdd
     * @return Product
     */
    public abstract Product ProductService.addToPurchaseOrders(Product product, Iterable<Long> purchaseOrdersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param purchaseOrdersToRemove
     * @return Product
     */
    public abstract Product ProductService.removeFromPurchaseOrders(Product product, Iterable<Long> purchaseOrdersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param purchaseOrders
     * @return Product
     */
    public abstract Product ProductService.setPurchaseOrders(Product product, Iterable<Long> purchaseOrders);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param category
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findByCategory(CustomerOrder category, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findBySupplier(Supplier supplier, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param category
     * @return Long
     */
    public abstract long ProductService.countByCategory(CustomerOrder category);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @return Long
     */
    public abstract long ProductService.countBySupplier(Supplier supplier);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param discontinued
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductService.findByDiscontinuedOrderByNameAsc(Boolean discontinued, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param discontinued
     * @return Long
     */
    public abstract long ProductService.countByDiscontinuedOrderByNameAsc(Boolean discontinued);
    
}
