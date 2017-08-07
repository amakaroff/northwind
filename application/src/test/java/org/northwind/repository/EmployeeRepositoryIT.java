package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.EmployeeDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = EmployeeRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = EmployeeRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = EmployeeDataOnDemand.class)
public class EmployeeRepositoryIT {
}
