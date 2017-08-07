package org.northwind.repository;
import org.northwind.model.dod.CityDataOnDemand;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = CityRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CityRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CityDataOnDemand.class)
public class CityRepositoryIT {
}
