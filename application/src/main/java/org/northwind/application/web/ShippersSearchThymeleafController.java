package org.northwind.application.web;
import org.northwind.model.Shipper;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.finder.RooSearch;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.datatables.Datatables;
import io.springlets.data.web.datatables.DatatablesData;
import io.springlets.data.web.datatables.DatatablesPageable;
import org.apache.commons.lang3.StringUtils;
import org.northwind.model.ShipperPhoneFormBean;
import org.northwind.service.api.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * = ShippersSearchThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Shipper.class, type = ControllerType.SEARCH)
@RooSearch(finders = { "findByPhone" })
@RooThymeleaf
@Controller
@RequestMapping(value = "/shippers/search", name = "ShippersSearchThymeleafController", produces = MediaType.TEXT_HTML_VALUE)
public class ShippersSearchThymeleafController {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MessageSource messageSource;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ShipperService shipperService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param shipperService
     * @param messageSource
     */
    @Autowired
    public ShippersSearchThymeleafController(ShipperService shipperService, MessageSource messageSource) {
        setShipperService(shipperService);
        setMessageSource(messageSource);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ShipperService
     */
    public ShipperService getShipperService() {
        return shipperService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param shipperService
     */
    public void setShipperService(ShipperService shipperService) {
        this.shipperService = shipperService;
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
     * @param formBean
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "byPhoneForm", value = "/byPhone/search-form")
    public ModelAndView byPhoneForm(@ModelAttribute("formBean") ShipperPhoneFormBean formBean, Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        return new ModelAndView("shippers/findByPhoneForm");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "byPhone", value = "/byPhone")
    public ModelAndView byPhone(@ModelAttribute("formBean") ShipperPhoneFormBean formBean, Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        return new ModelAndView("shippers/findByPhone");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "byPhoneDt", value = "/byPhone/dt", produces = Datatables.MEDIA_TYPE)
    @ResponseBody
    public ResponseEntity<DatatablesData<Shipper>> byPhoneDt(@ModelAttribute("formBean") ShipperPhoneFormBean formBean, GlobalSearch search, DatatablesPageable pageable, @RequestParam(Datatables.PARAMETER_DRAW) Integer draw) {
        Page<Shipper> shippers = getShipperService().findByPhone(formBean, search, pageable);
        long totalShippersCount = shippers.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalShippersCount = getShipperService().countByPhone(formBean);
        }
        DatatablesData<Shipper> datatablesData = new DatatablesData<Shipper>(shippers, totalShippersCount, draw);
        return ResponseEntity.ok(datatablesData);
    }
}
