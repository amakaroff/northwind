package org.northwind.application.config.jackson;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDomainModelModule;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.northwind.application.web.CategoryJsonMixin;
import org.northwind.application.web.CityJsonMixin;
import org.northwind.application.web.CountryJsonMixin;
import org.northwind.application.web.CustomerJsonMixin;
import org.northwind.application.web.CustomerOrderJsonMixin;
import org.northwind.application.web.EmployeeJsonMixin;
import org.northwind.application.web.OrderDetailJsonMixin;
import org.northwind.application.web.PartyJsonMixin;
import org.northwind.application.web.ProductJsonMixin;
import org.northwind.application.web.PurchaseOrderJsonMixin;
import org.northwind.application.web.RegionJsonMixin;
import org.northwind.application.web.ReportJsonMixin;
import org.northwind.application.web.ShipperJsonMixin;
import org.northwind.application.web.SoldProductJsonMixin;
import org.northwind.application.web.StoreJsonMixin;
import org.northwind.application.web.SupplierJsonMixin;
import org.northwind.model.Category;
import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Customer;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Employee;
import org.northwind.model.OrderDetail;
import org.northwind.model.Party;
import org.northwind.model.Product;
import org.northwind.model.PurchaseOrder;
import org.northwind.model.Region;
import org.northwind.model.Report;
import org.northwind.model.Shipper;
import org.northwind.model.SoldProduct;
import org.northwind.model.Store;
import org.northwind.model.Supplier;
import org.springframework.boot.jackson.JsonComponent;

/**
 * = DomainModelModule
 TODO Auto-generated class documentation
 *
 */
@RooDomainModelModule
@JsonComponent
public class DomainModelModule extends SimpleModule {

    /**
     * TODO Auto-generated constructor documentation
     *
     */
    public DomainModelModule() {
        // Mixin registration
        setMixInAnnotation(Category.class, CategoryJsonMixin.class);
        setMixInAnnotation(City.class, CityJsonMixin.class);
        setMixInAnnotation(Country.class, CountryJsonMixin.class);
        setMixInAnnotation(Customer.class, CustomerJsonMixin.class);
        setMixInAnnotation(CustomerOrder.class, CustomerOrderJsonMixin.class);
        setMixInAnnotation(Employee.class, EmployeeJsonMixin.class);
        setMixInAnnotation(OrderDetail.class, OrderDetailJsonMixin.class);
        setMixInAnnotation(Party.class, PartyJsonMixin.class);
        setMixInAnnotation(Product.class, ProductJsonMixin.class);
        setMixInAnnotation(PurchaseOrder.class, PurchaseOrderJsonMixin.class);
        setMixInAnnotation(Region.class, RegionJsonMixin.class);
        setMixInAnnotation(Report.class, ReportJsonMixin.class);
        setMixInAnnotation(Shipper.class, ShipperJsonMixin.class);
        setMixInAnnotation(SoldProduct.class, SoldProductJsonMixin.class);
        setMixInAnnotation(Store.class, StoreJsonMixin.class);
        setMixInAnnotation(Supplier.class, SupplierJsonMixin.class);
    }
}
