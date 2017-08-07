package org.northwind.repository;
import org.northwind.model.dod.CustomerOrderDataOnDemand;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = CustomerOrderRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CustomerOrderRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CustomerOrderDataOnDemand.class)
public class CustomerOrderRepositoryIT {
}
