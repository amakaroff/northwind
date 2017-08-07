package org.northwind.service.api;
import org.northwind.model.Customer;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.addon.security.annotations.RooSecurityAuthorization;
import org.springframework.roo.addon.security.annotations.RooSecurityAuthorizations;

/**
 * = CustomerService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Customer.class)
@RooSecurityAuthorizations(authorizations = { @RooSecurityAuthorization(method = "delete", parameters = { Customer.class }, roles = "ADMIN,EMPLOYEE"), @RooSecurityAuthorization(method = "delete", parameters = { Iterable.class }, roles = "ADMIN,EMPLOYEE") })
public interface CustomerService {
}
