package org.northwind.service.api;
import org.northwind.model.CustomerOrder;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Customer;
import org.northwind.model.Region;
import org.northwind.model.Shipper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CustomerOrderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = CustomerOrder.class)
public interface CustomerOrderService extends EntityResolver<CustomerOrder, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return CustomerOrder
     */
    CustomerOrder findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     */
    void delete(CustomerOrder customerOrder);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<CustomerOrder> save(Iterable<CustomerOrder> entities);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    void delete(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return CustomerOrder
     */
    CustomerOrder save(CustomerOrder entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return CustomerOrder
     */
    CustomerOrder findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<CustomerOrder> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<CustomerOrder> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    long count();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param customerOrdersToAdd
     * @return CustomerOrder
     */
    CustomerOrder addToCustomerOrders(CustomerOrder customerOrder, Iterable<Long> customerOrdersToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param customerOrdersToRemove
     * @return CustomerOrder
     */
    CustomerOrder removeFromCustomerOrders(CustomerOrder customerOrder, Iterable<Long> customerOrdersToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param customerOrders
     * @return CustomerOrder
     */
    CustomerOrder setCustomerOrders(CustomerOrder customerOrder, Iterable<Long> customerOrders);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param orderDetailsToAdd
     * @return CustomerOrder
     */
    CustomerOrder addToOrderDetails(CustomerOrder customerOrder, Iterable<Long> orderDetailsToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param orderDetailsToRemove
     * @return CustomerOrder
     */
    CustomerOrder removeFromOrderDetails(CustomerOrder customerOrder, Iterable<Long> orderDetailsToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param orderDetails
     * @return CustomerOrder
     */
    CustomerOrder setOrderDetails(CustomerOrder customerOrder, Iterable<Long> orderDetails);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param purchaseOrdersToAdd
     * @return CustomerOrder
     */
    CustomerOrder addToPurchaseOrders(CustomerOrder customerOrder, Iterable<Long> purchaseOrdersToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param purchaseOrdersToRemove
     * @return CustomerOrder
     */
    CustomerOrder removeFromPurchaseOrders(CustomerOrder customerOrder, Iterable<Long> purchaseOrdersToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param purchaseOrders
     * @return CustomerOrder
     */
    CustomerOrder setPurchaseOrders(CustomerOrder customerOrder, Iterable<Long> purchaseOrders);

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findByCity(City city, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findByCustomer(Customer customer, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findByEmployee(CustomerOrder employee, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<CustomerOrder> findByShipper(Shipper shipper, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @return Long
     */
    long countByCity(City city);

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @return Long
     */
    long countByCountry(Country country);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @return Long
     */
    long countByCustomer(Customer customer);

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @return Long
     */
    long countByEmployee(CustomerOrder employee);

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @return Long
     */
    long countByRegion(Region region);

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @return Long
     */
    long countByShipper(Shipper shipper);
}
