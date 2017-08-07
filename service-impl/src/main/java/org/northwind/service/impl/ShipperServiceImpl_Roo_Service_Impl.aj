// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.service.impl;

import io.springlets.data.domain.GlobalSearch;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Shipper;
import org.northwind.model.ShipperPhoneFormBean;
import org.northwind.repository.ShipperRepository;
import org.northwind.service.api.CustomerOrderService;
import org.northwind.service.impl.ShipperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ShipperServiceImpl_Roo_Service_Impl {
    
    declare @type: ShipperServiceImpl: @Service;
    
    declare @type: ShipperServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ShipperRepository ShipperServiceImpl.shipperRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private CustomerOrderService ShipperServiceImpl.customerOrderService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param shipperRepository
     * @param customerOrderService
     */
    @Autowired
    public ShipperServiceImpl.new(ShipperRepository shipperRepository, @Lazy CustomerOrderService customerOrderService) {
        setShipperRepository(shipperRepository);
        setCustomerOrderService(customerOrderService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ShipperRepository
     */
    public ShipperRepository ShipperServiceImpl.getShipperRepository() {
        return shipperRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shipperRepository
     */
    public void ShipperServiceImpl.setShipperRepository(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerOrderService
     */
    public CustomerOrderService ShipperServiceImpl.getCustomerOrderService() {
        return customerOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrderService
     */
    public void ShipperServiceImpl.setCustomerOrderService(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shipper
     * @param customerOrdersToAdd
     * @return Shipper
     */
    @Transactional
    public Shipper ShipperServiceImpl.addToCustomerOrders(Shipper shipper, Iterable<Long> customerOrdersToAdd) {
        List<CustomerOrder> customerOrders = getCustomerOrderService().findAll(customerOrdersToAdd);
        shipper.addToCustomerOrders(customerOrders);
        return getShipperRepository().save(shipper);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shipper
     * @param customerOrdersToRemove
     * @return Shipper
     */
    @Transactional
    public Shipper ShipperServiceImpl.removeFromCustomerOrders(Shipper shipper, Iterable<Long> customerOrdersToRemove) {
        List<CustomerOrder> customerOrders = getCustomerOrderService().findAll(customerOrdersToRemove);
        shipper.removeFromCustomerOrders(customerOrders);
        return getShipperRepository().save(shipper);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shipper
     * @param customerOrders
     * @return Shipper
     */
    @Transactional
    public Shipper ShipperServiceImpl.setCustomerOrders(Shipper shipper, Iterable<Long> customerOrders) {
        List<CustomerOrder> items = getCustomerOrderService().findAll(customerOrders);
        Set<CustomerOrder> currents = shipper.getCustomerOrders();
        Set<CustomerOrder> toRemove = new HashSet<CustomerOrder>();
        for (Iterator<CustomerOrder> iterator = currents.iterator(); iterator.hasNext();) {
            CustomerOrder nextCustomerOrder = iterator.next();
            if (items.contains(nextCustomerOrder)) {
                items.remove(nextCustomerOrder);
            } else {
                toRemove.add(nextCustomerOrder);
            }
        }
        shipper.removeFromCustomerOrders(toRemove);
        shipper.addToCustomerOrders(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        shipper.setVersion(shipper.getVersion() + 1);
        return getShipperRepository().save(shipper);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shipper
     */
    @Transactional
    public void ShipperServiceImpl.delete(Shipper shipper) {
        // Clear bidirectional one-to-many parent relationship with CustomerOrder
        for (CustomerOrder item : shipper.getCustomerOrders()) {
            item.setShipper(null);
        }
        
        getShipperRepository().delete(shipper);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<Shipper> ShipperServiceImpl.save(Iterable<Shipper> entities) {
        return getShipperRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void ShipperServiceImpl.delete(Iterable<Long> ids) {
        List<Shipper> toDelete = getShipperRepository().findAll(ids);
        getShipperRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Shipper
     */
    @Transactional
    public Shipper ShipperServiceImpl.save(Shipper entity) {
        return getShipperRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Shipper
     */
    public Shipper ShipperServiceImpl.findOne(Long id) {
        return getShipperRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Shipper
     */
    public Shipper ShipperServiceImpl.findOneForUpdate(Long id) {
        return getShipperRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<Shipper> ShipperServiceImpl.findAll(Iterable<Long> ids) {
        return getShipperRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<Shipper> ShipperServiceImpl.findAll() {
        return getShipperRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long ShipperServiceImpl.count() {
        return getShipperRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Shipper> ShipperServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getShipperRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param companyName
     * @param pageable
     * @return Page
     */
    public Page<Shipper> ShipperServiceImpl.findByCompanyName(String companyName, Pageable pageable) {
        return getShipperRepository().findByCompanyName(companyName, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param formBean
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Shipper> ShipperServiceImpl.findByPhone(ShipperPhoneFormBean formBean, GlobalSearch globalSearch, Pageable pageable) {
        return getShipperRepository().findByPhone(formBean, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param companyName
     * @return Long
     */
    public long ShipperServiceImpl.countByCompanyName(String companyName) {
        return getShipperRepository().countByCompanyName(companyName);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param formBean
     * @return Long
     */
    public long ShipperServiceImpl.countByPhone(ShipperPhoneFormBean formBean) {
        return getShipperRepository().countByPhone(formBean);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Shipper> ShipperServiceImpl.getEntityType() {
        return Shipper.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> ShipperServiceImpl.getIdType() {
        return Long.class;
    }
    
}
