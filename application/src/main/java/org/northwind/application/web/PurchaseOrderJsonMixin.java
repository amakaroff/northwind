package org.northwind.application.web;
import org.northwind.model.PurchaseOrder;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooJsonMixin;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;

/**
 * = PurchaseOrderJsonMixin
 TODO Auto-generated class documentation
 *
 */
@RooJsonMixin(entity = PurchaseOrder.class)
public abstract class PurchaseOrderJsonMixin {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonDeserialize(using = ProductDeserializer.class)
    private Product product;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonDeserialize(using = CustomerOrderDeserializer.class)
    private CustomerOrder employee;

    /**
     * TODO Auto-generated method documentation
     *
     * @return CustomerOrder
     */
    public CustomerOrder getEmployee() {
        return employee;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     */
    public void setEmployee(CustomerOrder employee) {
        this.employee = employee;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     */
    public void setProduct(Product product) {
        this.product = product;
    }
}
