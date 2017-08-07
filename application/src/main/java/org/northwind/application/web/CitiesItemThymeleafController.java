package org.northwind.application.web;
import org.northwind.model.City;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CitiesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = City.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CitiesItemThymeleafController {
}
