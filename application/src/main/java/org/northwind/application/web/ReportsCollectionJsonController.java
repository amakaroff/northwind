package org.northwind.application.web;
import org.northwind.model.Report;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ReportsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Report.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ReportsCollectionJsonController {
}
