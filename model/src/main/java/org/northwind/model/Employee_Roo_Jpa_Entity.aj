// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model;

import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import org.northwind.model.Employee;
import org.northwind.model.PurchaseOrder;
import org.springframework.util.Assert;

privileged aspect Employee_Roo_Jpa_Entity {
    
    declare @type: Employee: @Entity;
    
    declare @type: Employee: @EntityFormat;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Employee.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Employee.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrdersToAdd
     */
    public void Employee.addToPurchaseOrders(Iterable<PurchaseOrder> purchaseOrdersToAdd) {
        Assert.notNull(purchaseOrdersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (PurchaseOrder item : purchaseOrdersToAdd) {
            this.purchaseOrders.add(item);
            item.setEmployee(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrdersToRemove
     */
    public void Employee.removeFromPurchaseOrders(Iterable<PurchaseOrder> purchaseOrdersToRemove) {
        Assert.notNull(purchaseOrdersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (PurchaseOrder item : purchaseOrdersToRemove) {
            this.purchaseOrders.remove(item);
            item.setEmployee(null);
        }
    }
    
}
