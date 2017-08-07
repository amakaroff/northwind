package org.northwind.repository;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.PurchaseOrderDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = PurchaseOrderRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PurchaseOrderRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PurchaseOrderDataOnDemand.class)
public class PurchaseOrderRepositoryIT {
}
