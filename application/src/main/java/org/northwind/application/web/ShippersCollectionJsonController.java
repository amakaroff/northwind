package org.northwind.application.web;
import org.northwind.model.Shipper;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ShippersCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Shipper.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ShippersCollectionJsonController {
}
