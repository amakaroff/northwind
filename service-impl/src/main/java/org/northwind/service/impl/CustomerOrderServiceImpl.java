package org.northwind.service.impl;
import org.northwind.service.api.CustomerOrderService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Customer;
import org.northwind.model.CustomerOrder;
import org.northwind.model.OrderDetail;
import org.northwind.model.PurchaseOrder;
import org.northwind.model.Region;
import org.northwind.model.Shipper;
import org.northwind.repository.CustomerOrderRepository;
import org.northwind.service.api.OrderDetailService;
import org.northwind.service.api.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CustomerOrderServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = CustomerOrderService.class)
@Service
@Transactional(readOnly = true)
public class CustomerOrderServiceImpl implements CustomerOrderService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PurchaseOrderService purchaseOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerOrderService customerOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerOrderRepository customerOrderRepository;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OrderDetailService orderDetailService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param customerOrderRepository
     * @param customerOrderService
     * @param orderDetailService
     * @param purchaseOrderService
     */
    @Autowired
    public CustomerOrderServiceImpl(CustomerOrderRepository customerOrderRepository, @Lazy CustomerOrderService customerOrderService, @Lazy OrderDetailService orderDetailService, @Lazy PurchaseOrderService purchaseOrderService) {
        setCustomerOrderRepository(customerOrderRepository);
        setCustomerOrderService(customerOrderService);
        setOrderDetailService(orderDetailService);
        setPurchaseOrderService(purchaseOrderService);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return CustomerOrderRepository
     */
    public CustomerOrderRepository getCustomerOrderRepository() {
        return customerOrderRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrderRepository
     */
    public void setCustomerOrderRepository(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return CustomerOrderService
     */
    public CustomerOrderService getCustomerOrderService() {
        return customerOrderService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrderService
     */
    public void setCustomerOrderService(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return OrderDetailService
     */
    public OrderDetailService getOrderDetailService() {
        return orderDetailService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param orderDetailService
     */
    public void setOrderDetailService(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return PurchaseOrderService
     */
    public PurchaseOrderService getPurchaseOrderService() {
        return purchaseOrderService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param purchaseOrderService
     */
    public void setPurchaseOrderService(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param customerOrdersToAdd
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder addToCustomerOrders(CustomerOrder customerOrder, Iterable<Long> customerOrdersToAdd) {
        List<CustomerOrder> customerOrders = getCustomerOrderService().findAll(customerOrdersToAdd);
        customerOrder.addToCustomerOrders(customerOrders);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param orderDetailsToAdd
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder addToOrderDetails(CustomerOrder customerOrder, Iterable<Long> orderDetailsToAdd) {
        List<OrderDetail> orderDetails = getOrderDetailService().findAll(orderDetailsToAdd);
        customerOrder.addToOrderDetails(orderDetails);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param purchaseOrdersToAdd
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder addToPurchaseOrders(CustomerOrder customerOrder, Iterable<Long> purchaseOrdersToAdd) {
        List<PurchaseOrder> purchaseOrders = getPurchaseOrderService().findAll(purchaseOrdersToAdd);
        customerOrder.addToPurchaseOrders(purchaseOrders);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param customerOrdersToRemove
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder removeFromCustomerOrders(CustomerOrder customerOrder, Iterable<Long> customerOrdersToRemove) {
        List<CustomerOrder> customerOrders = getCustomerOrderService().findAll(customerOrdersToRemove);
        customerOrder.removeFromCustomerOrders(customerOrders);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param orderDetailsToRemove
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder removeFromOrderDetails(CustomerOrder customerOrder, Iterable<Long> orderDetailsToRemove) {
        List<OrderDetail> orderDetails = getOrderDetailService().findAll(orderDetailsToRemove);
        customerOrder.removeFromOrderDetails(orderDetails);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param purchaseOrdersToRemove
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder removeFromPurchaseOrders(CustomerOrder customerOrder, Iterable<Long> purchaseOrdersToRemove) {
        List<PurchaseOrder> purchaseOrders = getPurchaseOrderService().findAll(purchaseOrdersToRemove);
        customerOrder.removeFromPurchaseOrders(purchaseOrders);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param customerOrders
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder setCustomerOrders(CustomerOrder customerOrder, Iterable<Long> customerOrders) {
        List<CustomerOrder> items = getCustomerOrderService().findAll(customerOrders);
        Set<CustomerOrder> currents = customerOrder.getCustomerOrders();
        Set<CustomerOrder> toRemove = new HashSet<CustomerOrder>();
        for (Iterator<CustomerOrder> iterator = currents.iterator(); iterator.hasNext(); ) {
            CustomerOrder nextCustomerOrder = iterator.next();
            if (items.contains(nextCustomerOrder)) {
                items.remove(nextCustomerOrder);
            } else {
                toRemove.add(nextCustomerOrder);
            }
        }
        customerOrder.removeFromCustomerOrders(toRemove);
        customerOrder.addToCustomerOrders(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        customerOrder.setVersion(customerOrder.getVersion() + 1);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param orderDetails
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder setOrderDetails(CustomerOrder customerOrder, Iterable<Long> orderDetails) {
        List<OrderDetail> items = getOrderDetailService().findAll(orderDetails);
        Set<OrderDetail> currents = customerOrder.getOrderDetails();
        Set<OrderDetail> toRemove = new HashSet<OrderDetail>();
        for (Iterator<OrderDetail> iterator = currents.iterator(); iterator.hasNext(); ) {
            OrderDetail nextOrderDetail = iterator.next();
            if (items.contains(nextOrderDetail)) {
                items.remove(nextOrderDetail);
            } else {
                toRemove.add(nextOrderDetail);
            }
        }
        customerOrder.removeFromOrderDetails(toRemove);
        customerOrder.addToOrderDetails(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        customerOrder.setVersion(customerOrder.getVersion() + 1);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param purchaseOrders
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder setPurchaseOrders(CustomerOrder customerOrder, Iterable<Long> purchaseOrders) {
        List<PurchaseOrder> items = getPurchaseOrderService().findAll(purchaseOrders);
        Set<PurchaseOrder> currents = customerOrder.getPurchaseOrders();
        Set<PurchaseOrder> toRemove = new HashSet<PurchaseOrder>();
        for (Iterator<PurchaseOrder> iterator = currents.iterator(); iterator.hasNext(); ) {
            PurchaseOrder nextPurchaseOrder = iterator.next();
            if (items.contains(nextPurchaseOrder)) {
                items.remove(nextPurchaseOrder);
            } else {
                toRemove.add(nextPurchaseOrder);
            }
        }
        customerOrder.removeFromPurchaseOrders(toRemove);
        customerOrder.addToPurchaseOrders(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        customerOrder.setVersion(customerOrder.getVersion() + 1);
        return getCustomerOrderRepository().save(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     */
    @Transactional
    public void delete(CustomerOrder customerOrder) {
        // Clear bidirectional many-to-one child relationship with Country
        if (customerOrder.getCountry() != null) {
            customerOrder.getCountry().getCustomerOrders().remove(customerOrder);
        }
        // Clear bidirectional many-to-one child relationship with Shipper
        if (customerOrder.getShipper() != null) {
            customerOrder.getShipper().getCustomerOrders().remove(customerOrder);
        }
        // Clear bidirectional many-to-one child relationship with City
        if (customerOrder.getCity() != null) {
            customerOrder.getCity().getCustomerOrders().remove(customerOrder);
        }
        // Clear bidirectional many-to-one child relationship with CustomerOrder
        if (customerOrder.getEmployee() != null) {
            customerOrder.getEmployee().getCustomerOrders().remove(customerOrder);
        }
        // Clear bidirectional many-to-one child relationship with Region
        if (customerOrder.getRegion() != null) {
            customerOrder.getRegion().getCustomerOrders().remove(customerOrder);
        }
        // Clear bidirectional many-to-one child relationship with Customer
        if (customerOrder.getCustomer() != null) {
            customerOrder.getCustomer().getCustomerOrders().remove(customerOrder);
        }
        // Clear bidirectional one-to-many parent relationship with CustomerOrder
        for (CustomerOrder item : customerOrder.getCustomerOrders()) {
            item.setEmployee(null);
        }
        // Clear bidirectional one-to-many parent relationship with OrderDetail
        for (OrderDetail item : customerOrder.getOrderDetails()) {
            item.setCustomerOrder(null);
        }
        // Clear bidirectional one-to-many parent relationship with PurchaseOrder
        for (PurchaseOrder item : customerOrder.getPurchaseOrders()) {
            item.setEmployee(null);
        }
        getCustomerOrderRepository().delete(customerOrder);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    @Transactional
    public List<CustomerOrder> save(Iterable<CustomerOrder> entities) {
        return getCustomerOrderRepository().save(entities);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    @Transactional
    public void delete(Iterable<Long> ids) {
        List<CustomerOrder> toDelete = getCustomerOrderRepository().findAll(ids);
        getCustomerOrderRepository().deleteInBatch(toDelete);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return CustomerOrder
     */
    @Transactional
    public CustomerOrder save(CustomerOrder entity) {
        return getCustomerOrderRepository().save(entity);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return CustomerOrder
     */
    public CustomerOrder findOne(Long id) {
        return getCustomerOrderRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return CustomerOrder
     */
    public CustomerOrder findOneForUpdate(Long id) {
        return getCustomerOrderRepository().findOneDetached(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<CustomerOrder> findAll(Iterable<Long> ids) {
        return getCustomerOrderRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<CustomerOrder> findAll() {
        return getCustomerOrderRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getCustomerOrderRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findByCity(City city, GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findByCity(city, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findByCountry(country, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findByCustomer(Customer customer, GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findByCustomer(customer, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findByEmployee(CustomerOrder employee, GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findByEmployee(employee, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findByRegion(region, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<CustomerOrder> findByShipper(Shipper shipper, GlobalSearch globalSearch, Pageable pageable) {
        return getCustomerOrderRepository().findByShipper(shipper, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @return Long
     */
    public long countByCity(City city) {
        return getCustomerOrderRepository().countByCity(city);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @return Long
     */
    public long countByCountry(Country country) {
        return getCustomerOrderRepository().countByCountry(country);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @return Long
     */
    public long countByCustomer(Customer customer) {
        return getCustomerOrderRepository().countByCustomer(customer);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @return Long
     */
    public long countByEmployee(CustomerOrder employee) {
        return getCustomerOrderRepository().countByEmployee(employee);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @return Long
     */
    public long countByRegion(Region region) {
        return getCustomerOrderRepository().countByRegion(region);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @return Long
     */
    public long countByShipper(Shipper shipper) {
        return getCustomerOrderRepository().countByShipper(shipper);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<CustomerOrder> getEntityType() {
        return CustomerOrder.class;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Long> getIdType() {
        return Long.class;
    }
}
