package org.northwind.application.web;
import org.northwind.model.PurchaseOrder;
import org.northwind.service.api.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PurchaseOrderDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PurchaseOrder.class)
public class PurchaseOrderDeserializer extends JsonObjectDeserializer<PurchaseOrder> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PurchaseOrderService purchaseOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param purchaseOrderService
     * @param conversionService
     */
    @Autowired
    public PurchaseOrderDeserializer(@Lazy PurchaseOrderService purchaseOrderService, ConversionService conversionService) {
        this.purchaseOrderService = purchaseOrderService;
        this.conversionService = conversionService;
    }
}
