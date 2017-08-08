package org.northwind.repository;
import org.northwind.model.Party;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Region;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartyRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Party.class)
@Transactional(readOnly = true)
public interface PartyRepository extends DetachableJpaRepository<Party, Long>, PartyRepositoryCustom {

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
