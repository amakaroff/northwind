package org.northwind.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.test.RooJsonControllerIntegrationTest;
import io.springlets.boot.test.autoconfigure.web.servlet.SpringletsWebMvcTest;
import org.junit.runner.RunWith;
import org.northwind.model.dod.OrderDetailFactory;
import org.northwind.service.api.OrderDetailService;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * = OrderDetailsCollectionJsonControllerIT
 TODO Auto-generated class documentation
 *
 */
@RooJsonControllerIntegrationTest(targetClass = OrderDetailsCollectionJsonController.class)
@RunWith(SpringRunner.class)
@SpringletsWebMvcTest(controllers = OrderDetailsCollectionJsonController.class, secure = false)
public class OrderDetailsCollectionJsonControllerIT {
}
