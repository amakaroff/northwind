package org.northwind.repository;
import org.northwind.model.Employee;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EmployeeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Employee.class)
public interface EmployeeRepository {
}
