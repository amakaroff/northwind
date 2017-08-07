package org.northwind.application.web;
import org.northwind.model.Country;
import org.northwind.service.api.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = CountryDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Country.class)
public class CountryDeserializer extends JsonObjectDeserializer<Country> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CountryService countryService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param countryService
     * @param conversionService
     */
    @Autowired
    public CountryDeserializer(@Lazy CountryService countryService, ConversionService conversionService) {
        this.countryService = countryService;
        this.conversionService = conversionService;
    }
}
