package org.northwind.repository;
import org.northwind.model.Store;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.City;
import org.northwind.model.Region;
import org.northwind.model.Supplier;
import org.springframework.transaction.annotation.Transactional;

/**
 * = StoreRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Store.class)
@Transactional(readOnly = true)
public interface StoreRepository extends DetachableJpaRepository<Store, Long>, StoreRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param suppliers
     * @return Long
     */
    long countBySuppliersContains(Supplier suppliers);

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
