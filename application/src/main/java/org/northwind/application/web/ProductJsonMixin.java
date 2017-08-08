package org.northwind.application.web;
import org.northwind.model.Product;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooJsonMixin;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Set;
import org.northwind.model.Category;
import org.northwind.model.OrderDetail;
import org.northwind.model.PurchaseOrder;
import org.northwind.model.Supplier;

/**
 * = ProductJsonMixin
 TODO Auto-generated class documentation
 *
 */
@RooJsonMixin(entity = Product.class)
public abstract class ProductJsonMixin {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonIgnore
    private Set<OrderDetail> orderDetails;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonDeserialize(using = SupplierDeserializer.class)
    private Supplier supplier;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonDeserialize(using = CategoryDeserializer.class)
    private Category category;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonIgnore
    private Set<PurchaseOrder> purchaseOrders;

    /**
     * TODO Auto-generated method documentation
     *
     * @return Set
     */
    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param orderDetails
     */
    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Set
     */
    public Set<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param purchaseOrders
     */
    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
