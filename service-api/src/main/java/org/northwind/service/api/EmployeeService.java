package org.northwind.service.api;
import org.northwind.model.Employee;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = EmployeeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Employee.class)
public interface EmployeeService extends EntityResolver<Employee, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Employee
     */
    Employee findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     */
    void delete(Employee employee);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Employee> save(Iterable<Employee> entities);

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
     * @return Employee
     */
    Employee save(Employee entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Employee
     */
    Employee findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Employee> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Employee> findAll();

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
    Page<Employee> findAll(GlobalSearch globalSearch, Pageable pageable);
}
