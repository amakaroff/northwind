package org.northwind.repository;
import org.northwind.model.dod.CountryDataOnDemand;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = CountryRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CountryRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CountryDataOnDemand.class)
public class CountryRepositoryIT {
}
