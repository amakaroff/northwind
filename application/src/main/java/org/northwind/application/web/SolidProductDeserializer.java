package org.northwind.application.web;
import org.northwind.model.SolidProduct;
import org.northwind.service.api.SolidProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = SolidProductDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SolidProduct.class)
public class SolidProductDeserializer extends JsonObjectDeserializer<SolidProduct> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SolidProductService solidProductService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param solidProductService
     * @param conversionService
     */
    @Autowired
    public SolidProductDeserializer(@Lazy SolidProductService solidProductService, ConversionService conversionService) {
        this.solidProductService = solidProductService;
        this.conversionService = conversionService;
    }
}
