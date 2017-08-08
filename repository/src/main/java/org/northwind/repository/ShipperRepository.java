package org.northwind.repository;
import org.northwind.model.Shipper;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.northwind.model.ShipperPhoneFormBean;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ShipperRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Shipper.class, finders = { @RooFinder(value = "findByPhone", returnType = Shipper.class, formBean = ShipperPhoneFormBean.class) })
@Transactional(readOnly = true)
public interface ShipperRepository extends DetachableJpaRepository<Shipper, Long>, ShipperRepositoryCustom {
}
