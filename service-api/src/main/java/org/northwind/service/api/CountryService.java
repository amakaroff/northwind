package org.northwind.service.api;
import org.northwind.model.Country;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CountryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Country.class)
public interface CountryService extends EntityResolver<Country, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Country
     */
    Country findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Country> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Country> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    long count();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Country> findAll(GlobalSearch globalSearch, Pageable pageable);
}
