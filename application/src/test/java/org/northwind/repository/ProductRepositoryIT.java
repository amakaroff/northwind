package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.ProductDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = ProductRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ProductRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ProductDataOnDemand.class)
public class ProductRepositoryIT {
}
