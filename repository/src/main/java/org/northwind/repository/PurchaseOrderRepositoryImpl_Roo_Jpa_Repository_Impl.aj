// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.northwind.model.Employee;
import org.northwind.model.Product;
import org.northwind.model.PurchaseOrder;
import org.northwind.model.QPurchaseOrder;
import org.northwind.repository.PurchaseOrderRepositoryCustom;
import org.northwind.repository.PurchaseOrderRepositoryImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect PurchaseOrderRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare parents: PurchaseOrderRepositoryImpl implements PurchaseOrderRepositoryCustom;
    
    declare @type: PurchaseOrderRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseOrderRepositoryImpl.EMPLOYEE = "employee";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseOrderRepositoryImpl.PRODUCT = "product";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseOrderRepositoryImpl.UNIT_COST = "unitCost";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PurchaseOrderRepositoryImpl.QUANTITY = "quantity";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseOrder> PurchaseOrderRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QPurchaseOrder purchaseOrder = QPurchaseOrder.purchaseOrder;
        
        JPQLQuery<PurchaseOrder> query = from(purchaseOrder);
        
        Path<?>[] paths = new Path<?>[] {purchaseOrder.employee,purchaseOrder.product,purchaseOrder.unitCost,purchaseOrder.quantity};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(EMPLOYEE, purchaseOrder.employee)
			.map(PRODUCT, purchaseOrder.product)
			.map(UNIT_COST, purchaseOrder.unitCost)
			.map(QUANTITY, purchaseOrder.quantity);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, purchaseOrder);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseOrder> PurchaseOrderRepositoryImpl.findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable) {
        
        QPurchaseOrder purchaseOrder = QPurchaseOrder.purchaseOrder;
        
        JPQLQuery<PurchaseOrder> query = from(purchaseOrder);
        
        Assert.notNull(employee, "employee is required");
        
        query.where(purchaseOrder.employee.eq(employee));
        Path<?>[] paths = new Path<?>[] {purchaseOrder.employee,purchaseOrder.product,purchaseOrder.unitCost,purchaseOrder.quantity};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(EMPLOYEE, purchaseOrder.employee)
			.map(PRODUCT, purchaseOrder.product)
			.map(UNIT_COST, purchaseOrder.unitCost)
			.map(QUANTITY, purchaseOrder.quantity);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, purchaseOrder);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PurchaseOrder> PurchaseOrderRepositoryImpl.findByProduct(Product product, GlobalSearch globalSearch, Pageable pageable) {
        
        QPurchaseOrder purchaseOrder = QPurchaseOrder.purchaseOrder;
        
        JPQLQuery<PurchaseOrder> query = from(purchaseOrder);
        
        Assert.notNull(product, "product is required");
        
        query.where(purchaseOrder.product.eq(product));
        Path<?>[] paths = new Path<?>[] {purchaseOrder.employee,purchaseOrder.product,purchaseOrder.unitCost,purchaseOrder.quantity};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(EMPLOYEE, purchaseOrder.employee)
			.map(PRODUCT, purchaseOrder.product)
			.map(UNIT_COST, purchaseOrder.unitCost)
			.map(QUANTITY, purchaseOrder.quantity);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, purchaseOrder);
    }
    
}
