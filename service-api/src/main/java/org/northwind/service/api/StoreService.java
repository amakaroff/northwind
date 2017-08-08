package org.northwind.service.api;
import org.northwind.model.Store;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.City;
import org.northwind.model.Region;
import org.northwind.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = StoreService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Store.class)
public interface StoreService extends EntityResolver<Store, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Store
     */
    Store findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param store
     */
    void delete(Store store);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Store> save(Iterable<Store> entities);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    void delete(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return Store
     */
    Store save(Store entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Store
     */
    Store findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Store> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Store> findAll();

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
    Page<Store> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Store> findByCity(City city, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Store> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param suppliers
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Store> findBySuppliersContains(Supplier suppliers, GlobalSearch globalSearch, Pageable pageable);

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

    /**
     * TODO Auto-generated method documentation
     *
     * @param suppliers
     * @return Long
     */
    long countBySuppliersContains(Supplier suppliers);
}
