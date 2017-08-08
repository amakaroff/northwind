package org.northwind.model;
import org.springframework.roo.addon.jpa.annotations.test.RooJpaUnitTest;
import java.util.Arrays;
import java.util.Collections;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.northwind.model.dod.CustomerOrderFactory;
import org.northwind.model.dod.OrderDetailFactory;
import org.northwind.model.dod.PurchaseOrderFactory;

/**
 * = CustomerOrderTest
 TODO Auto-generated class documentation
 *
 */
@RooJpaUnitTest(targetClass = CustomerOrder.class)
public class CustomerOrderTest {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PurchaseOrderFactory purchaseOrderFactory = new PurchaseOrderFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerOrderFactory customerOrderFactory = new CustomerOrderFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OrderDetailFactory orderDetailFactory = new OrderDetailFactory();

    /**
     * TODO Auto-generated method documentation
     *
     * @return CustomerOrderFactory
     */
    public CustomerOrderFactory getCustomerOrderFactory() {
        return customerOrderFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrderFactory
     */
    public void setCustomerOrderFactory(CustomerOrderFactory customerOrderFactory) {
        this.customerOrderFactory = customerOrderFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return OrderDetailFactory
     */
    public OrderDetailFactory getOrderDetailFactory() {
        return orderDetailFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param orderDetailFactory
     */
    public void setOrderDetailFactory(OrderDetailFactory orderDetailFactory) {
        this.orderDetailFactory = orderDetailFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return PurchaseOrderFactory
     */
    public PurchaseOrderFactory getPurchaseOrderFactory() {
        return purchaseOrderFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param purchaseOrderFactory
     */
    public void setPurchaseOrderFactory(PurchaseOrderFactory purchaseOrderFactory) {
        this.purchaseOrderFactory = purchaseOrderFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @throws Exception
     */
    @Test
    public void addToCustomerOrdersShouldAddTheCustomerOrderToThecustomerOrdersRelationship() {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        CustomerOrder customerOrder1 = getCustomerOrderFactory().create(0);
        CustomerOrder customerOrder2 = getCustomerOrderFactory().create(1);
        // Exercise
        customerOrder.addToCustomerOrders(Arrays.asList(customerOrder1, customerOrder2));
        // Verify
        assertThat(customerOrder.getCustomerOrders()).as("Check 'addToCustomerOrders' adds the customerOrders to the relationship").contains(customerOrder1).contains(customerOrder2);
        assertThat(customerOrder).as("Check 'addToCustomerOrders' updates the CustomerOrder relationship side").isEqualTo(customerOrder1.getEmployee()).isEqualTo(customerOrder2.getEmployee());
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @throws Exception
     */
    @Test
    public void addToCustomerOrdersShouldRemoveTheCustomerOrderFromThecustomerOrdersRelationship() {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        CustomerOrder customerOrder1 = getCustomerOrderFactory().create(0);
        CustomerOrder customerOrder2 = getCustomerOrderFactory().create(1);
        customerOrder.addToCustomerOrders(Arrays.asList(customerOrder1, customerOrder2));
        // Exercise
        customerOrder.removeFromCustomerOrders(Collections.singleton(customerOrder1));
        // Verify
        assertThat(customerOrder1.getEmployee()).as("Check 'removeFromCustomerOrders' updates the CustomerOrder relationship side").isNull();
        assertThat(customerOrder.getCustomerOrders()).as("Check 'removeFromCustomerOrders' removes a CustomerOrder from the relationship").doesNotContain(customerOrder1).contains(customerOrder2);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @throws Exception
     */
    @Test
    public void addToOrderDetailsShouldAddTheOrderDetailToTheorderDetailsRelationship() {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        OrderDetail orderDetail1 = getOrderDetailFactory().create(0);
        OrderDetail orderDetail2 = getOrderDetailFactory().create(1);
        // Exercise
        customerOrder.addToOrderDetails(Arrays.asList(orderDetail1, orderDetail2));
        // Verify
        assertThat(customerOrder.getOrderDetails()).as("Check 'addToOrderDetails' adds the orderDetails to the relationship").contains(orderDetail1).contains(orderDetail2);
        assertThat(customerOrder).as("Check 'addToOrderDetails' updates the OrderDetail relationship side").isEqualTo(orderDetail1.getCustomerOrder()).isEqualTo(orderDetail2.getCustomerOrder());
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @throws Exception
     */
    @Test
    public void addToOrderDetailsShouldRemoveTheOrderDetailFromTheorderDetailsRelationship() {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        OrderDetail orderDetail1 = getOrderDetailFactory().create(0);
        OrderDetail orderDetail2 = getOrderDetailFactory().create(1);
        customerOrder.addToOrderDetails(Arrays.asList(orderDetail1, orderDetail2));
        // Exercise
        customerOrder.removeFromOrderDetails(Collections.singleton(orderDetail1));
        // Verify
        assertThat(orderDetail1.getCustomerOrder()).as("Check 'removeFromOrderDetails' updates the OrderDetail relationship side").isNull();
        assertThat(customerOrder.getOrderDetails()).as("Check 'removeFromOrderDetails' removes a OrderDetail from the relationship").doesNotContain(orderDetail1).contains(orderDetail2);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @throws Exception
     */
    @Test
    public void addToPurchaseOrdersShouldAddThePurchaseOrderToThepurchaseOrdersRelationship() {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        PurchaseOrder purchaseOrder1 = getPurchaseOrderFactory().create(0);
        PurchaseOrder purchaseOrder2 = getPurchaseOrderFactory().create(1);
        // Exercise
        customerOrder.addToPurchaseOrders(Arrays.asList(purchaseOrder1, purchaseOrder2));
        // Verify
        assertThat(customerOrder.getPurchaseOrders()).as("Check 'addToPurchaseOrders' adds the purchaseOrders to the relationship").contains(purchaseOrder1).contains(purchaseOrder2);
        assertThat(customerOrder).as("Check 'addToPurchaseOrders' updates the PurchaseOrder relationship side").isEqualTo(purchaseOrder1.getEmployee()).isEqualTo(purchaseOrder2.getEmployee());
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @throws Exception
     */
    @Test
    public void addToPurchaseOrdersShouldRemoveThePurchaseOrderFromThepurchaseOrdersRelationship() {
        // Setup
        CustomerOrder customerOrder = getCustomerOrderFactory().create(0);
        PurchaseOrder purchaseOrder1 = getPurchaseOrderFactory().create(0);
        PurchaseOrder purchaseOrder2 = getPurchaseOrderFactory().create(1);
        customerOrder.addToPurchaseOrders(Arrays.asList(purchaseOrder1, purchaseOrder2));
        // Exercise
        customerOrder.removeFromPurchaseOrders(Collections.singleton(purchaseOrder1));
        // Verify
        assertThat(purchaseOrder1.getEmployee()).as("Check 'removeFromPurchaseOrders' updates the PurchaseOrder relationship side").isNull();
        assertThat(customerOrder.getPurchaseOrders()).as("Check 'removeFromPurchaseOrders' removes a PurchaseOrder from the relationship").doesNotContain(purchaseOrder1).contains(purchaseOrder2);
    }
}
