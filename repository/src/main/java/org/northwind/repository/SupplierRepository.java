package org.northwind.repository;
import org.northwind.model.Supplier;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Region;
import org.springframework.transaction.annotation.Transactional;

/**
 * = SupplierRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Supplier.class)
@Transactional(readOnly = true)
public interface SupplierRepository extends DetachableJpaRepository<Supplier, Long>, SupplierRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @return Long
     */
    long countByCountry(Country country);

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @return Long
     */
    long countByCity(City city);

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @return Long
     */
    long countByRegion(Region region);
}
