package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.ShipperDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = ShipperRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ShipperRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ShipperDataOnDemand.class)
public class ShipperRepositoryIT {
}
