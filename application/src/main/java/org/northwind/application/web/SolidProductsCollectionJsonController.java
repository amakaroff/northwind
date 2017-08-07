package org.northwind.application.web;
import org.northwind.model.SolidProduct;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = SolidProductsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = SolidProduct.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class SolidProductsCollectionJsonController {
}
