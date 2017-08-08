package org.northwind.application.web;
import org.northwind.model.CustomerOrder;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.datatables.ConvertedDatatablesData;
import io.springlets.data.web.datatables.Datatables;
import io.springlets.data.web.datatables.DatatablesColumns;
import io.springlets.data.web.datatables.DatatablesPageable;
import io.springlets.data.web.select2.Select2DataSupport;
import io.springlets.data.web.select2.Select2DataWithConversion;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;
import org.northwind.application.web.reports.ExportingErrorException;
import org.northwind.application.web.reports.JasperReportsCsvExporter;
import org.northwind.application.web.reports.JasperReportsExporter;
import org.northwind.application.web.reports.JasperReportsPdfExporter;
import org.northwind.application.web.reports.JasperReportsXlsExporter;
import org.northwind.model.Status;
import org.northwind.service.api.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;

/**
 * = CustomerOrdersCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CustomerOrder.class, type = ControllerType.COLLECTION)
@RooThymeleaf
@Controller
@RequestMapping(value = "/customerorders", name = "CustomerOrdersCollectionThymeleafController", produces = MediaType.TEXT_HTML_VALUE)
public class CustomerOrdersCollectionThymeleafController {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerOrderService customerOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MethodLinkBuilderFactory<CustomerOrdersItemThymeleafController> itemLink;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MessageSource messageSource;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param customerOrderService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public CustomerOrdersCollectionThymeleafController(CustomerOrderService customerOrderService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setCustomerOrderService(customerOrderService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(CustomerOrdersItemThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return CustomerOrderService
     */
    public CustomerOrderService getCustomerOrderService() {
        return customerOrderService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrderService
     */
    public void setCustomerOrderService(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
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
    public MethodLinkBuilderFactory<CustomerOrdersItemThymeleafController> getItemLink() {
        return itemLink;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param itemLink
     */
    public void setItemLink(MethodLinkBuilderFactory<CustomerOrdersItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ConversionService
     */
    public ConversionService getConversionService() {
        return conversionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param conversionService
     */
    public void setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "list")
    public ModelAndView list(Model model) {
        return new ModelAndView("/customerorders/list");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(produces = Datatables.MEDIA_TYPE, name = "datatables", value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<CustomerOrder>> datatables(DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        Page<CustomerOrder> customerOrders = getCustomerOrderService().findAll(search, pageable);
        long totalCustomerOrdersCount = customerOrders.getTotalElements();
        if (search != null && StringUtils.isNotBlank(search.getText())) {
            totalCustomerOrdersCount = getCustomerOrderService().count();
        }
        ConvertedDatatablesData<CustomerOrder> datatablesData = new ConvertedDatatablesData<CustomerOrder>(customerOrders, totalCustomerOrdersCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(datatablesData);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param search
     * @param pageable
     * @param locale
     * @return ResponseEntity
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, name = "select2", value = "/s2")
    @ResponseBody
    public ResponseEntity<Select2DataSupport<CustomerOrder>> select2(GlobalSearch search, Pageable pageable, Locale locale) {
        Page<CustomerOrder> customerOrders = getCustomerOrderService().findAll(search, pageable);
        String idExpression = "#{id}";
        Select2DataSupport<CustomerOrder> select2Data = new Select2DataWithConversion<CustomerOrder>(customerOrders, idExpression, getConversionService());
        return ResponseEntity.ok(select2Data);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataBinder
     */
    @InitBinder("customerOrder")
    public void initCustomerOrderBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param model
     */
    public void populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("orderDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("requiredDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("shippedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("invoiceDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("closeDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("birthDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("hireDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param model
     */
    public void populateForm(Model model) {
        populateFormats(model);
        model.addAttribute("status", Arrays.asList(Status.values()));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param result
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView create(@Valid @ModelAttribute CustomerOrder customerOrder, BindingResult result, Model model) {
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView("/customerorders/create");
        }
        CustomerOrder newCustomerOrder = getCustomerOrderService().save(customerOrder);
        UriComponents showURI = getItemLink().to(CustomerOrdersItemThymeleafLinkFactory.SHOW).with("customerOrder", newCustomerOrder.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView createForm(Model model) {
        populateForm(model);
        model.addAttribute("customerOrder", new CustomerOrder());
        return new ModelAndView("customerorders/create");
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    @ResponseBody
    public ResponseEntity<?> deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        getCustomerOrderService().delete(ids);
        return ResponseEntity.ok().build();
    }

    /**
     * Method that obtains the filtered and ordered records using the Datatables information and
     * export them to a new report file. (It ignores the current pagination).
     *
     * To generate the report file it uses the `DynamicJasper` library
     * (http://dynamicjasper.com). This library allows developers to generate reports dynamically
     * without use an specific template to each entity.
     *
     * To customize the appearance of ALL generated reports, you could customize the
     * "export_default.jrxml" template located in "src/main/resources/templates/reports/". However,
     * if you want to customize the appearance of this specific report, you could create a new
     * ".jrxml" file and provide it to the library replacing the `builder.setTemplateFile();`
     * operation used in this implementation.
     *
     * @param search GlobalSearch that contains the filter provided by the Datatables component.
     * @param pageable Pageable that contains the Sort info provided by the Datatabes component.
     * @param datatablesColumns Columns displayed in the Datatables component.
     * @param response The HttpServletResponse.
     * @param exporter An specific JasperReportsExporter to be used during export process.
     * @param fileName The final filename to use.
     * @param locale The current Locale in the view context.
     */
    public void export(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, String[] datatablesColumns, HttpServletResponse response, JasperReportsExporter exporter, String fileName, Locale locale) {
        // Obtain the filtered and ordered elements
        Page<CustomerOrder> customerOrders = getCustomerOrderService().findAll(search, pageable);
        // Prevent generation of reports with empty data
        if (customerOrders == null || customerOrders.getContent().isEmpty()) {
            return;
        }
        // Creates a new ReportBuilder using DynamicJasper library
        FastReportBuilder builder = new FastReportBuilder();
        // IMPORTANT: By default, this application uses "export_default.jrxml"
        // to generate all reports. If you want to customize this specific report,
        // create a new ".jrxml" template and customize it. (Take in account the
        // DynamicJasper restrictions:
        // http://dynamicjasper.com/2010/10/06/how-to-use-custom-jrxml-templates/)
        builder.setTemplateFile("templates/reports/export_default.jrxml");
        // The generated report will display the same columns as the Datatables component.
        // However, this is not mandatory. You could edit this code if you want to ignore
        // the provided datatablesColumns
        if (datatablesColumns != null) {
            for (String column : datatablesColumns) {
                // Delegates in addColumnToReportBuilder to include each datatables column
                // to the report builder
                addColumnToReportBuilder(column, builder, locale, fileName);
            }
        }
        // This property resizes the columns to use full width page.
        // Set false value if you want to use the specific width of each column.
        builder.setUseFullPageWidth(true);
        // Creates a new Jasper Reports Datasource using the obtained elements
        JRDataSource ds = new JRBeanCollectionDataSource(customerOrders.getContent());
        // Generates the JasperReport
        JasperPrint jp;
        try {
            jp = DynamicJasperHelper.generateJasperPrint(builder.build(), new ClassicLayoutManager(), ds);
        } catch (JRException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", new Object[] { StringUtils.substringAfterLast(fileName, ".").toUpperCase() }, String.format("Error while exporting data to StringUtils file", StringUtils.substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
        // Converts the JaspertReport element to a ByteArrayOutputStream and
        // write it into the response stream using the provided JasperReportExporter
        try {
            exporter.export(jp, fileName, response);
        } catch (JRException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", new Object[] { StringUtils.substringAfterLast(fileName, ".").toUpperCase() }, String.format("Error while exporting data to StringUtils file", StringUtils.substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        } catch (IOException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", new Object[] { StringUtils.substringAfterLast(fileName, ".").toUpperCase() }, String.format("Error while exporting data to StringUtils file", StringUtils.substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
    }

    /**
     * It delegates in the `export` method providing the necessary information
     * to generate a CSV report.
     *
     * @param search The GlobalSearch that contains the filter provided by the Datatables component
     * @param pageable The Pageable that contains the Sort info provided by the Datatabes component
     * @param datatablesColumns The Columns displayed in the Datatables component
     * @param response The HttpServletResponse
     * @return ResponseEntity
     */
    @GetMapping(name = "exportCsv", value = "/export/csv")
    @ResponseBody
    public ResponseEntity<?> exportCsv(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsCsvExporter(), "customerOrders_report.csv", locale);
        return ResponseEntity.ok().build();
    }

    /**
     * It delegates in the `export` method providing the necessary information
     * to generate a PDF report.
     *
     * @param search The GlobalSearch that contains the filter provided by the Datatables component
     * @param pageable The Pageable that contains the Sort info provided by the Datatabes component
     * @param datatablesColumns The Columns displayed in the Datatables component
     * @param response The HttpServletResponse
     * @return ResponseEntity
     */
    @GetMapping(name = "exportPdf", value = "/export/pdf")
    @ResponseBody
    public ResponseEntity<?> exportPdf(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsPdfExporter(), "customerOrders_report.pdf", locale);
        return ResponseEntity.ok().build();
    }

    /**
     * It delegates in the `export` method providing the necessary information
     * to generate a XLS report.
     *
     * @param search The GlobalSearch that contains the filter provided by the Datatables component
     * @param pageable The Pageable that contains the Sort info provided by the Datatabes component
     * @param datatablesColumns The Columns displayed in the Datatables component
     * @param response The HttpServletResponse
     * @return ResponseEntity
     */
    @GetMapping(name = "exportXls", value = "/export/xls")
    @ResponseBody
    public ResponseEntity<?> exportXls(GlobalSearch search, @PageableDefault(size = 2147483647) Pageable pageable, @RequestParam("datatablesColumns") String[] datatablesColumns, HttpServletResponse response, Locale locale) {
        export(search, pageable, datatablesColumns, response, new JasperReportsXlsExporter(), "customerOrders_report.xls", locale);
        return ResponseEntity.ok().build();
    }

    /**
     * This method contains all the entity fields that are able to be displayed in a
     * report. The developer could add a new column to the report builder providing the
     * field name and the builder where the new field will be added as column.
     *
     * @param columnName the field name to show as column
     * @param builder The builder where the new field will be added as column.
     */
    public void addColumnToReportBuilder(String columnName, FastReportBuilder builder, Locale locale, String fileName) {
        try {
            if (columnName.equals("id")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_id", null, "Id", locale), "id", Long.class.getName(), 50);
            } else if (columnName.equals("version")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_version", null, "Version", locale), "version", Integer.class.getName(), 100);
            } else if (columnName.equals("orderDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_orderdate", null, "Order Date", locale), "orderDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("requiredDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_requireddate", null, "Required Date", locale), "requiredDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("shippedDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_shippeddate", null, "Shipped Date", locale), "shippedDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("freight")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_freight", null, "Freight", locale), "freight", BigDecimal.class.getName(), 100);
            } else if (columnName.equals("shipName")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_shipname", null, "Ship Name", locale), "shipName", String.class.getName(), 100);
            } else if (columnName.equals("shipAddress")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_shipaddress", null, "Ship Address", locale), "shipAddress", String.class.getName(), 100);
            } else if (columnName.equals("shipPostalCode")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_shippostalcode", null, "Ship Postal Code", locale), "shipPostalCode", String.class.getName(), 100);
            } else if (columnName.equals("status")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_status", null, "Status", locale), "status", Status.class.getName(), 100);
            } else if (columnName.equals("shipPhone")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_shipphone", null, "Ship Phone", locale), "shipPhone", String.class.getName(), 100);
            } else if (columnName.equals("invoiceDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_invoicedate", null, "Invoice Date", locale), "invoiceDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("closeDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_closedate", null, "Close Date", locale), "closeDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("firstName")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_firstname", null, "First Name", locale), "firstName", String.class.getName(), 100);
            } else if (columnName.equals("lastName")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_lastname", null, "Last Name", locale), "lastName", String.class.getName(), 100);
            } else if (columnName.equals("title")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_title", null, "Title", locale), "title", String.class.getName(), 100);
            } else if (columnName.equals("birthDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_birthdate", null, "Birth Date", locale), "birthDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("hireDate")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_hiredate", null, "Hire Date", locale), "hireDate", Calendar.class.getName(), 100);
            } else if (columnName.equals("extension")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_extension", null, "Extension", locale), "extension", String.class.getName(), 100);
            } else if (columnName.equals("photo")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_photo", null, "Photo", locale), "photo", String.class.getName(), 100);
            } else if (columnName.equals("notes")) {
                builder.addColumn(getMessageSource().getMessage("label_customerorder_notes", null, "Notes", locale), "notes", String.class.getName(), 100);
            }
        } catch (ColumnBuilderException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", new Object[] { StringUtils.substringAfterLast(fileName, ".").toUpperCase() }, String.format("Error while exporting data to StringUtils file", StringUtils.substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        } catch (ClassNotFoundException e) {
            String errorMessage = getMessageSource().getMessage("error_exportingErrorException", new Object[] { StringUtils.substringAfterLast(fileName, ".").toUpperCase() }, String.format("Error while exporting data to StringUtils file", StringUtils.substringAfterLast(fileName, ".").toUpperCase()), locale);
            throw new ExportingErrorException(errorMessage);
        }
    }
}
