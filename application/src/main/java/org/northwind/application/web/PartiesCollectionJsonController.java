package org.northwind.application.web;
import org.northwind.model.Party;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PartiesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Party.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PartiesCollectionJsonController {
}
