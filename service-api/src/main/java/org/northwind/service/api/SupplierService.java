package org.northwind.service.api;
import org.northwind.model.Supplier;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = SupplierService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Supplier.class)
public interface SupplierService extends EntityResolver<Supplier, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Supplier
     */
    Supplier findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     */
    void delete(Supplier supplier);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Supplier> save(Iterable<Supplier> entities);

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
     * @return Supplier
     */
    Supplier save(Supplier entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Supplier
     */
    Supplier findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Supplier> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Supplier> findAll();

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
    Page<Supplier> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param productsToAdd
     * @return Supplier
     */
    Supplier addToProducts(Supplier supplier, Iterable<Long> productsToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param productsToRemove
     * @return Supplier
     */
    Supplier removeFromProducts(Supplier supplier, Iterable<Long> productsToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param products
     * @return Supplier
     */
    Supplier setProducts(Supplier supplier, Iterable<Long> products);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param storesToAdd
     * @return Supplier
     */
    Supplier addToStores(Supplier supplier, Iterable<Long> storesToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param storesToRemove
     * @return Supplier
     */
    Supplier removeFromStores(Supplier supplier, Iterable<Long> storesToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @param stores
     * @return Supplier
     */
    Supplier setStores(Supplier supplier, Iterable<Long> stores);

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Supplier> findByCity(City city, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param country
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Supplier> findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Supplier> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);

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
     * @param country
     * @return Long
     */
    long countByCountry(Country country);

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @return Long
     */
    long countByRegion(Region region);
}
