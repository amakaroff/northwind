package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.OrderDetailDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = OrderDetailRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = OrderDetailRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = OrderDetailDataOnDemand.class)
public class OrderDetailRepositoryIT {
}
