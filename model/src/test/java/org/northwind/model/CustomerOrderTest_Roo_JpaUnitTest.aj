// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;
import org.northwind.model.CustomerOrder;
import org.northwind.model.CustomerOrderTest;
import org.northwind.model.OrderDetail;
import org.northwind.model.Product;
import org.northwind.model.dod.CustomerOrderFactory;
import org.northwind.model.dod.OrderDetailFactory;
import org.northwind.model.dod.ProductFactory;

privileged aspect CustomerOrderTest_Roo_JpaUnitTest {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private CustomerOrderFactory CustomerOrderTest.customerOrderFactory = new CustomerOrderFactory();
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OrderDetailFactory CustomerOrderTest.orderDetailFactory = new OrderDetailFactory();
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ProductFactory CustomerOrderTest.productFactory = new ProductFactory();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerOrderFactory
     */
    public CustomerOrderFactory CustomerOrderTest.getCustomerOrderFactory() {
        return customerOrderFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrderFactory
     */
    public void CustomerOrderTest.setCustomerOrderFactory(CustomerOrderFactory customerOrderFactory) {
        this.customerOrderFactory = customerOrderFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return OrderDetailFactory
     */
    public OrderDetailFactory CustomerOrderTest.getOrderDetailFactory() {
        return orderDetailFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param orderDetailFactory
     */
    public void CustomerOrderTest.setOrderDetailFactory(OrderDetailFactory orderDetailFactory) {
        this.orderDetailFactory = orderDetailFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProductFactory
     */
    public ProductFactory CustomerOrderTest.getProductFactory() {
        return productFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param productFactory
     */
    public void CustomerOrderTest.setProductFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @throws Exception
     */
    @Test
    public void CustomerOrderTest.addToOrderDetailsShouldAddTheOrderDetailToTheorderDetailsRelationship() throws Exception {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        OrderDetail orderDetail1 = getOrderDetailFactory().create(0);
        OrderDetail orderDetail2 = getOrderDetailFactory().create(1);
        
        // Exercise
        customerOrder.addToOrderDetails(Arrays.asList(orderDetail1, orderDetail2));
        
        // Verify
        assertThat(customerOrder.getOrderDetails()).as("Check 'addToOrderDetails' adds the orderDetails to the relationship")
            .contains(orderDetail1).contains(orderDetail2);
        assertThat(customerOrder).as("Check 'addToOrderDetails' updates the OrderDetail relationship side")
            .isEqualTo(orderDetail1.getCustomerOrder()).isEqualTo(orderDetail2.getCustomerOrder());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @throws Exception
     */
    @Test
    public void CustomerOrderTest.addToOrderDetailsShouldRemoveTheOrderDetailFromTheorderDetailsRelationship() throws Exception {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        OrderDetail orderDetail1 = getOrderDetailFactory().create(0);
        OrderDetail orderDetail2 = getOrderDetailFactory().create(1);
        customerOrder.addToOrderDetails(Arrays.asList(orderDetail1, orderDetail2));
        
        // Exercise
        customerOrder.removeFromOrderDetails(Collections.singleton(orderDetail1));
        
        // Verify
        assertThat(orderDetail1.getCustomerOrder()).as("Check 'removeFromOrderDetails' updates the OrderDetail relationship side")
            .isNull();
        assertThat(customerOrder.getOrderDetails()).as("Check 'removeFromOrderDetails' removes a OrderDetail from the relationship")
            .doesNotContain(orderDetail1).contains(orderDetail2);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @throws Exception
     */
    @Test
    public void CustomerOrderTest.addToProductsShouldAddTheProductToTheproductsRelationship() throws Exception {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        Product product1 = getProductFactory().create(0);
        Product product2 = getProductFactory().create(1);
        
        // Exercise
        customerOrder.addToProducts(Arrays.asList(product1, product2));
        
        // Verify
        assertThat(customerOrder.getProducts()).as("Check 'addToProducts' adds the products to the relationship")
            .contains(product1).contains(product2);
        assertThat(customerOrder).as("Check 'addToProducts' updates the Product relationship side")
            .isEqualTo(product1.getCategory()).isEqualTo(product2.getCategory());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @throws Exception
     */
    @Test
    public void CustomerOrderTest.addToProductsShouldRemoveTheProductFromTheproductsRelationship() throws Exception {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        Product product1 = getProductFactory().create(0);
        Product product2 = getProductFactory().create(1);
        customerOrder.addToProducts(Arrays.asList(product1, product2));
        
        // Exercise
        customerOrder.removeFromProducts(Collections.singleton(product1));
        
        // Verify
        assertThat(product1.getCategory()).as("Check 'removeFromProducts' updates the Product relationship side")
            .isNull();
        assertThat(customerOrder.getProducts()).as("Check 'removeFromProducts' removes a Product from the relationship")
            .doesNotContain(product1).contains(product2);
    }
    
}
