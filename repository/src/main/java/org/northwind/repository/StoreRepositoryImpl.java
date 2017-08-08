package org.northwind.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.northwind.model.Store;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.northwind.model.City;
import org.northwind.model.QStore;
import org.northwind.model.Region;
import org.northwind.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = StoreRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = StoreRepositoryCustom.class)
@Transactional(readOnly = true)
public class StoreRepositoryImpl extends QueryDslRepositorySupportExt<Store> implements StoreRepositoryCustom {

    /**
     * TODO Auto-generated constructor documentation
     */
    StoreRepositoryImpl() {
        super(Store.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String CITY = "city";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String POSTAL_CODE = "postalCode";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String PHONE = "phone";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String REGION = "region";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String NAME = "name";

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Store> findAll(GlobalSearch globalSearch, Pageable pageable) {
        QStore store = QStore.store;
        JPQLQuery<Store> query = from(store);
        Path<?>[] paths = new Path<?>[] { store.city, store.region, store.name, store.postalCode, store.phone };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CITY, store.city).map(REGION, store.region).map(NAME, store.name).map(POSTAL_CODE, store.postalCode).map(PHONE, store.phone);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, store);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Store> findByCity(City city, GlobalSearch globalSearch, Pageable pageable) {
        QStore store = QStore.store;
        JPQLQuery<Store> query = from(store);
        Assert.notNull(city, "city is required");
        query.where(store.city.eq(city));
        Path<?>[] paths = new Path<?>[] { store.city, store.region, store.name, store.postalCode, store.phone };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CITY, store.city).map(REGION, store.region).map(NAME, store.name).map(POSTAL_CODE, store.postalCode).map(PHONE, store.phone);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, store);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Store> findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable) {
        QStore store = QStore.store;
        JPQLQuery<Store> query = from(store);
        Assert.notNull(region, "region is required");
        query.where(store.region.eq(region));
        Path<?>[] paths = new Path<?>[] { store.city, store.region, store.name, store.postalCode, store.phone };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CITY, store.city).map(REGION, store.region).map(NAME, store.name).map(POSTAL_CODE, store.postalCode).map(PHONE, store.phone);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, store);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param suppliers
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Store> findBySuppliersContains(Supplier suppliers, GlobalSearch globalSearch, Pageable pageable) {
        QStore store = QStore.store;
        JPQLQuery<Store> query = from(store);
        Assert.notNull(suppliers, "suppliers is required");
        query.where(store.suppliers.contains(suppliers));
        Path<?>[] paths = new Path<?>[] { store.city, store.region, store.name, store.postalCode, store.phone };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CITY, store.city).map(REGION, store.region).map(NAME, store.name).map(POSTAL_CODE, store.postalCode).map(PHONE, store.phone);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, store);
    }
}
