package org.northwind.service.api;
import org.northwind.model.Customer;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.addon.security.annotations.RooSecurityAuthorization;
import org.springframework.roo.addon.security.annotations.RooSecurityAuthorizations;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.CustomerInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CustomerService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Customer.class)
@RooSecurityAuthorizations(authorizations = { @RooSecurityAuthorization(method = "delete", parameters = { Customer.class }, roles = "ADMIN,EMPLOYEE"), @RooSecurityAuthorization(method = "delete", parameters = { Iterable.class }, roles = "ADMIN,EMPLOYEE") })
public interface CustomerService extends EntityResolver<Customer, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Customer
     */
    Customer findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     */
    void delete(Customer customer);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Customer> save(Iterable<Customer> entities);

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
     * @return Customer
     */
    Customer save(Customer entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Customer
     */
    Customer findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Customer> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Customer> findAll();

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
    Page<CustomerInfo> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @param customerOrdersToAdd
     * @return Customer
     */
    Customer addToCustomerOrders(Customer customer, Iterable<Long> customerOrdersToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @param customerOrdersToRemove
     * @return Customer
     */
    Customer removeFromCustomerOrders(Customer customer, Iterable<Long> customerOrdersToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param customer
     * @param customerOrders
     * @return Customer
     */
    Customer setCustomerOrders(Customer customer, Iterable<Long> customerOrders);
}
