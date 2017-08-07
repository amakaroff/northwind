// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model;

import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import org.northwind.model.OrderDetail;
import org.northwind.model.Product;
import org.northwind.model.PurchaseOrder;
import org.springframework.util.Assert;

privileged aspect Product_Roo_Jpa_Entity {
    
    declare @type: Product: @Entity;
    
    declare @type: Product: @EntityFormat("#{name} #{code}");
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Product.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Product.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrdersToAdd
     */
    public void Product.addToPurchaseOrders(Iterable<PurchaseOrder> purchaseOrdersToAdd) {
        Assert.notNull(purchaseOrdersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (PurchaseOrder item : purchaseOrdersToAdd) {
            this.purchaseOrders.add(item);
            item.setProduct(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrdersToRemove
     */
    public void Product.removeFromPurchaseOrders(Iterable<PurchaseOrder> purchaseOrdersToRemove) {
        Assert.notNull(purchaseOrdersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (PurchaseOrder item : purchaseOrdersToRemove) {
            this.purchaseOrders.remove(item);
            item.setProduct(null);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orderDetailsToAdd
     */
    public void Product.addToOrderDetails(Iterable<OrderDetail> orderDetailsToAdd) {
        Assert.notNull(orderDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (OrderDetail item : orderDetailsToAdd) {
            this.orderDetails.add(item);
            item.setProduct(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orderDetailsToRemove
     */
    public void Product.removeFromOrderDetails(Iterable<OrderDetail> orderDetailsToRemove) {
        Assert.notNull(orderDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (OrderDetail item : orderDetailsToRemove) {
            this.orderDetails.remove(item);
            item.setProduct(null);
        }
    }
    
}
