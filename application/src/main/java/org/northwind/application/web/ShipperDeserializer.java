package org.northwind.application.web;
import org.northwind.model.Shipper;
import org.northwind.service.api.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ShipperDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Shipper.class)
public class ShipperDeserializer extends JsonObjectDeserializer<Shipper> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ShipperService shipperService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param shipperService
     * @param conversionService
     */
    @Autowired
    public ShipperDeserializer(@Lazy ShipperService shipperService, ConversionService conversionService) {
        this.shipperService = shipperService;
        this.conversionService = conversionService;
    }
}
