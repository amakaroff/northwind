package org.northwind.application.web;
import org.northwind.model.Party;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PartiesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Party.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PartiesItemJsonController {
}
