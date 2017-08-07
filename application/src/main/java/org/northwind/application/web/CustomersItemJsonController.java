package org.northwind.application.web;
import org.northwind.model.Customer;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = CustomersItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Customer.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class CustomersItemJsonController {
}
