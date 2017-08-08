package org.northwind.application.web;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.test.RooThymeleafControllerIntegrationTest;
import io.springlets.boot.test.autoconfigure.web.servlet.SpringletsWebMvcTest;
import org.junit.runner.RunWith;
import org.northwind.model.dod.CountryFactory;
import org.northwind.service.api.CountryService;
import org.northwind.service.api.CustomerOrderService;
import org.northwind.service.api.PartyService;
import org.northwind.service.api.RegionService;
import org.northwind.service.api.SupplierService;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * = CountriesItemRegionsThymeleafControllerIT
 TODO Auto-generated class documentation
 *
 */
@RooThymeleafControllerIntegrationTest(targetClass = CountriesItemRegionsThymeleafController.class)
@RunWith(SpringRunner.class)
@SpringletsWebMvcTest(controllers = CountriesItemRegionsThymeleafController.class, secure = false)
public class CountriesItemRegionsThymeleafControllerIT {
}
