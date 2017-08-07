// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.service.api;

import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.Employee;
import org.northwind.service.api.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect EmployeeService_Roo_Service {
    
    declare parents: EmployeeService extends EntityResolver<Employee, Long>;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Employee
     */
    public abstract Employee EmployeeService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     */
    public abstract void EmployeeService.delete(Employee employee);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<Employee> EmployeeService.save(Iterable<Employee> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void EmployeeService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Employee
     */
    public abstract Employee EmployeeService.save(Employee entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Employee
     */
    public abstract Employee EmployeeService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<Employee> EmployeeService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<Employee> EmployeeService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long EmployeeService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Employee> EmployeeService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param purchaseOrdersToAdd
     * @return Employee
     */
    public abstract Employee EmployeeService.addToPurchaseOrders(Employee employee, Iterable<Long> purchaseOrdersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param purchaseOrdersToRemove
     * @return Employee
     */
    public abstract Employee EmployeeService.removeFromPurchaseOrders(Employee employee, Iterable<Long> purchaseOrdersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param purchaseOrders
     * @return Employee
     */
    public abstract Employee EmployeeService.setPurchaseOrders(Employee employee, Iterable<Long> purchaseOrders);
    
}