package org.northwind.repository;
import org.northwind.model.Customer;
import org.northwind.model.CustomerInfo;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CustomerRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Customer.class, defaultReturnType = CustomerInfo.class)
public interface CustomerRepository {
}
