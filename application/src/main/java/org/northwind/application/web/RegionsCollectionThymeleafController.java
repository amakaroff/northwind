package org.northwind.application.web;
import org.northwind.model.Region;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = RegionsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Region.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class RegionsCollectionThymeleafController {
}
