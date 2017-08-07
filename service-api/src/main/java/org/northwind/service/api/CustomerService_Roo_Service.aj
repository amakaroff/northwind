// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.service.api;

import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.Customer;
import org.northwind.model.CustomerInfo;
import org.northwind.service.api.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect CustomerService_Roo_Service {
    
    declare parents: CustomerService extends EntityResolver<Customer, Long>;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Customer
     */
    public abstract Customer CustomerService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customer
     */
    public abstract void CustomerService.delete(Customer customer);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<Customer> CustomerService.save(Iterable<Customer> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void CustomerService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Customer
     */
    public abstract Customer CustomerService.save(Customer entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Customer
     */
    public abstract Customer CustomerService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<Customer> CustomerService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<Customer> CustomerService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long CustomerService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<CustomerInfo> CustomerService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customer
     * @param customerOrdersToAdd
     * @return Customer
     */
    public abstract Customer CustomerService.addToCustomerOrders(Customer customer, Iterable<Long> customerOrdersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customer
     * @param customerOrdersToRemove
     * @return Customer
     */
    public abstract Customer CustomerService.removeFromCustomerOrders(Customer customer, Iterable<Long> customerOrdersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customer
     * @param customerOrders
     * @return Customer
     */
    public abstract Customer CustomerService.setCustomerOrders(Customer customer, Iterable<Long> customerOrders);
    
}
