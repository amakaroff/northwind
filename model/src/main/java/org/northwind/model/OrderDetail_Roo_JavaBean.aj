// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model;

import java.math.BigDecimal;
import org.northwind.model.CustomerOrder;
import org.northwind.model.OrderDetail;
import org.northwind.model.Product;

privileged aspect OrderDetail_Roo_JavaBean {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public Long OrderDetail.getId() {
        return this.id;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     */
    public void OrderDetail.setId(Long id) {
        this.id = id;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Integer
     */
    public Integer OrderDetail.getVersion() {
        return this.version;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param version
     */
    public void OrderDetail.setVersion(Integer version) {
        this.version = version;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerOrder
     */
    public CustomerOrder OrderDetail.getCustomerOrder() {
        return this.customerOrder;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrder
     */
    public void OrderDetail.setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return BigDecimal
     */
    public BigDecimal OrderDetail.getUnitPrice() {
        return this.unitPrice;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitPrice
     */
    public void OrderDetail.setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Integer
     */
    public Integer OrderDetail.getQuantity() {
        return this.quantity;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param quantity
     */
    public void OrderDetail.setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return BigDecimal
     */
    public BigDecimal OrderDetail.getDiscount() {
        return this.discount;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param discount
     */
    public void OrderDetail.setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Product
     */
    public Product OrderDetail.getProduct() {
        return this.product;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param product
     */
    public void OrderDetail.setProduct(Product product) {
        this.product = product;
    }
    
}