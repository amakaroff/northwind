package org.northwind.application.web;
import org.northwind.model.Shipper;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.finder.RooSearch;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ShippersSearchThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Shipper.class, type = ControllerType.SEARCH)
@RooSearch(finders = { "findByPhone" })
@RooThymeleaf
public class ShippersSearchThymeleafController {
}
