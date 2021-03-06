package org.northwind.repository;
import org.northwind.model.Region;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;
import io.springlets.data.domain.GlobalSearch;
import org.northwind.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = RegionRepositoryCustom
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustom(entity = Region.class)
public interface RegionRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Region> findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Region> findAll(GlobalSearch globalSearch, Pageable pageable);
}
