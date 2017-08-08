package org.northwind.application.web;
import org.northwind.model.Employee;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import io.springlets.web.NotFoundException;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import java.util.Locale;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.northwind.service.api.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;

/**
 * = EmployeesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Employee.class, type = ControllerType.ITEM)
@RooThymeleaf
@Controller
@RequestMapping(value = "/employees/{employee}", name = "EmployeesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE)
public class EmployeesItemThymeleafController {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EmployeeService employeeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MethodLinkBuilderFactory<EmployeesItemThymeleafController> itemLink;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MessageSource messageSource;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param employeeService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public EmployeesItemThymeleafController(EmployeeService employeeService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setEmployeeService(employeeService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(EmployeesItemThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return EmployeeService
     */
    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employeeService
     */
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return MessageSource
     */
    public MessageSource getMessageSource() {
        return messageSource;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param messageSource
     */
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EmployeesItemThymeleafController> getItemLink() {
        return itemLink;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param itemLink
     */
    public void setItemLink(MethodLinkBuilderFactory<EmployeesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @param locale
     * @param method
     * @return Employee
     */
    @ModelAttribute
    public Employee getEmployee(@PathVariable("employee") Long id, Locale locale, HttpMethod method) {
        Employee employee = null;
        if (HttpMethod.PUT.equals(method)) {
            employee = employeeService.findOneForUpdate(id);
        } else {
            employee = employeeService.findOne(id);
        }
        if (employee == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] { "Employee", id }, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return employee;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView show(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return new ModelAndView("employees/show");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView showInline(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return new ModelAndView("employees/showInline :: inline-content");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataBinder
     */
    @InitBinder("employee")
    public void initEmployeeBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param model
     */
    public void populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param model
     */
    public void populateForm(Model model) {
        populateFormats(model);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView editForm(@ModelAttribute Employee employee, Model model) {
        populateForm(model);
        model.addAttribute("employee", employee);
        return new ModelAndView("employees/edit");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @param version
     * @param concurrencyControl
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView update(@Valid @ModelAttribute Employee employee, @RequestParam("version") Integer version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, BindingResult result, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView("employees/edit");
        }
        // Concurrency control
        Employee existingEmployee = getEmployeeService().findOne(employee.getId());
        if (employee.getVersion() != existingEmployee.getVersion() && StringUtils.isEmpty(concurrencyControl)) {
            populateForm(model);
            model.addAttribute("employee", employee);
            model.addAttribute("concurrency", true);
            return new ModelAndView("employees/edit");
        } else if (employee.getVersion() != existingEmployee.getVersion() && "discard".equals(concurrencyControl)) {
            populateForm(model);
            model.addAttribute("employee", existingEmployee);
            model.addAttribute("concurrency", false);
            return new ModelAndView("employees/edit");
        } else if (employee.getVersion() != existingEmployee.getVersion() && "apply".equals(concurrencyControl)) {
            // Update the version field to be able to override the existing values
            employee.setVersion(existingEmployee.getVersion());
        }
        Employee savedEmployee = getEmployeeService().save(employee);
        UriComponents showURI = getItemLink().to(EmployeesItemThymeleafLinkFactory.SHOW).with("employee", savedEmployee.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param employee
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> delete(@ModelAttribute Employee employee) {
        getEmployeeService().delete(employee);
        return ResponseEntity.ok().build();
    }
}
