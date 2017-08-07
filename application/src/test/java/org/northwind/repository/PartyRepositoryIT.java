package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.PartyDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = PartyRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PartyRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PartyDataOnDemand.class)
public class PartyRepositoryIT {
}
