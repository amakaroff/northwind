package org.northwind.application.web;
import org.northwind.model.OrderDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OrderDetailsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrderDetail.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class OrderDetailsCollectionJsonController {
}
