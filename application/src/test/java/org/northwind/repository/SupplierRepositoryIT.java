package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.SupplierDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = SupplierRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = SupplierRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = SupplierDataOnDemand.class)
public class SupplierRepositoryIT {
}
