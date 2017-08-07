package org.northwind.application.web;
import org.northwind.model.Employee;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EmployeesCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Employee.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class EmployeesCollectionThymeleafController {
}
