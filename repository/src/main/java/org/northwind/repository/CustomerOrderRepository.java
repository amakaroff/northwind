package org.northwind.repository;
import org.northwind.model.CustomerOrder;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Customer;
import org.northwind.model.Region;
import org.northwind.model.Shipper;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CustomerOrderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = CustomerOrder.class)
@Transactional(readOnly = true)
public interface CustomerOrderRepository extends DetachableJpaRepository<CustomerOrder, Long>, CustomerOrderRepositoryCustom {

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
     * @param shipper
     * @return Long
     */
    long countByShipper(Shipper shipper);

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
     * @param employee
     * @return Long
     */
    long countByEmployee(CustomerOrder employee);

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
     * @param customer
     * @return Long
     */
    long countByCustomer(Customer customer);
}
