package org.northwind.service.api;
import org.northwind.model.Shipper;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.northwind.model.ShipperPhoneFormBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ShipperService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Shipper.class)
public interface ShipperService extends EntityResolver<Shipper, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Shipper
     */
    Shipper findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     */
    void delete(Shipper shipper);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Shipper> save(Iterable<Shipper> entities);

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
     * @return Shipper
     */
    Shipper save(Shipper entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Shipper
     */
    Shipper findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Shipper> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Shipper> findAll();

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
    Page<Shipper> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @param customerOrdersToAdd
     * @return Shipper
     */
    Shipper addToCustomerOrders(Shipper shipper, Iterable<Long> customerOrdersToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @param customerOrdersToRemove
     * @return Shipper
     */
    Shipper removeFromCustomerOrders(Shipper shipper, Iterable<Long> customerOrdersToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipper
     * @param customerOrders
     * @return Shipper
     */
    Shipper setCustomerOrders(Shipper shipper, Iterable<Long> customerOrders);

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Shipper> findByPhone(ShipperPhoneFormBean formBean, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @return Long
     */
    long countByPhone(ShipperPhoneFormBean formBean);
}
