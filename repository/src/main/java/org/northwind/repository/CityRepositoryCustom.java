package org.northwind.repository;
import org.northwind.model.City;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;
import io.springlets.data.domain.GlobalSearch;
import org.northwind.model.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CityRepositoryCustom
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustom(entity = City.class)
public interface CityRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<City> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<City> findAll(GlobalSearch globalSearch, Pageable pageable);
}
