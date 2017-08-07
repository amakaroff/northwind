package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.ReportDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = ReportRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ReportRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ReportDataOnDemand.class)
public class ReportRepositoryIT {
}
