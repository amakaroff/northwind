// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.service.api;

import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.Employee;
import org.northwind.model.Product;
import org.northwind.model.PurchaseOrder;
import org.northwind.service.api.PurchaseOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect PurchaseOrderService_Roo_Service {
    
    declare parents: PurchaseOrderService extends EntityResolver<PurchaseOrder, Long>;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PurchaseOrder
     */
    public abstract PurchaseOrder PurchaseOrderService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrder
     */
    public abstract void PurchaseOrderService.delete(PurchaseOrder purchaseOrder);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<PurchaseOrder> PurchaseOrderService.save(Iterable<PurchaseOrder> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void PurchaseOrderService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PurchaseOrder
     */
    public abstract PurchaseOrder PurchaseOrderService.save(PurchaseOrder entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PurchaseOrder
     */
    public abstract PurchaseOrder PurchaseOrderService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<PurchaseOrder> PurchaseOrderService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<PurchaseOrder> PurchaseOrderService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long PurchaseOrderService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PurchaseOrder> PurchaseOrderService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PurchaseOrder> PurchaseOrderService.findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<PurchaseOrder> PurchaseOrderService.findByProduct(Product product, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @return Long
     */
    public abstract long PurchaseOrderService.countByEmployee(Employee employee);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @return Long
     */
    public abstract long PurchaseOrderService.countByProduct(Product product);
    
}
