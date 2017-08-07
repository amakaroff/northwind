package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.RegionDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = RegionRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = RegionRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = RegionDataOnDemand.class)
public class RegionRepositoryIT {
}
