package org.northwind.service.impl;
import org.northwind.service.api.EmployeeService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import io.springlets.mail.MailReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.northwind.model.Employee;
import org.northwind.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EmployeeServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = EmployeeService.class)
@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Autowired
    private MailReceiverService mailReceiver;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EmployeeRepository employeeRepository;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param employeeRepository
     */
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        setEmployeeRepository(employeeRepository);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return EmployeeRepository
     */
    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employeeRepository
     */
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     */
    @Transactional
    public void delete(Employee employee) {
        getEmployeeRepository().delete(employee);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    @Transactional
    public List<Employee> save(Iterable<Employee> entities) {
        return getEmployeeRepository().save(entities);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    @Transactional
    public void delete(Iterable<Long> ids) {
        List<Employee> toDelete = getEmployeeRepository().findAll(ids);
        getEmployeeRepository().deleteInBatch(toDelete);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return Employee
     */
    @Transactional
    public Employee save(Employee entity) {
        return getEmployeeRepository().save(entity);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Employee
     */
    public Employee findOne(Long id) {
        return getEmployeeRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Employee
     */
    public Employee findOneForUpdate(Long id) {
        return getEmployeeRepository().findOneDetached(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Employee> findAll(Iterable<Long> ids) {
        return getEmployeeRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Employee> findAll() {
        return getEmployeeRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getEmployeeRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Employee> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getEmployeeRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Employee> getEntityType() {
        return Employee.class;
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
