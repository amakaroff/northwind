package org.northwind.repository;
import org.northwind.model.Shipper;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;
import org.northwind.model.ShipperPhoneFormBean;

/**
 * = ShipperRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Shipper.class, finders = { @RooFinder(value = "findByCompanyName", returnType = Shipper.class), @RooFinder(value = "findByPhone", returnType = Shipper.class, formBean = ShipperPhoneFormBean.class) })
public interface ShipperRepository {
}
