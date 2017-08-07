package org.northwind.repository;
import org.northwind.model.dod.CustomerDataOnDemand;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = CustomerRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CustomerRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CustomerDataOnDemand.class)
public class CustomerRepositoryIT {
}
