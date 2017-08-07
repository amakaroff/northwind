package org.northwind.application.web;
import org.northwind.model.Supplier;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = SuppliersCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Supplier.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class SuppliersCollectionJsonController {
}
