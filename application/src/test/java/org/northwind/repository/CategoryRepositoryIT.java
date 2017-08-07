package org.northwind.repository;
import org.northwind.model.dod.CategoryDataOnDemand;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = CategoryRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CategoryRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CategoryDataOnDemand.class)
public class CategoryRepositoryIT {
}
