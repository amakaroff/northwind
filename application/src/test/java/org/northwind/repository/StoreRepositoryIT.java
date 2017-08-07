package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.StoreDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = StoreRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = StoreRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = StoreDataOnDemand.class)
public class StoreRepositoryIT {
}
