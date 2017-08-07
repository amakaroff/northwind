package org.northwind.application.web;
import org.northwind.model.Country;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CountriesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Country.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CountriesItemThymeleafController {
}
