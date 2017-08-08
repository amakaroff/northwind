package org.northwind.service.impl;
import org.northwind.service.api.CountryService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.northwind.model.Country;
import org.northwind.repository.CountryRepository;
import org.northwind.service.api.CustomerOrderService;
import org.northwind.service.api.PartyService;
import org.northwind.service.api.RegionService;
import org.northwind.service.api.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CountryServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = CountryService.class)
@Service
@Transactional(readOnly = true)
public class CountryServiceImpl implements CountryService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CountryRepository countryRepository;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerOrderService customerOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private RegionService regionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PartyService partyService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SupplierService supplierService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param countryRepository
     * @param customerOrderService
     * @param partyService
     * @param regionService
     * @param supplierService
     */
    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository, @Lazy CustomerOrderService customerOrderService, @Lazy PartyService partyService, @Lazy RegionService regionService, @Lazy SupplierService supplierService) {
        setCountryRepository(countryRepository);
        setCustomerOrderService(customerOrderService);
        setPartyService(partyService);
        setRegionService(regionService);
        setSupplierService(supplierService);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return CountryRepository
     */
    public CountryRepository getCountryRepository() {
        return countryRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param countryRepository
     */
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
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
     * @return PartyService
     */
    public PartyService getPartyService() {
        return partyService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param partyService
     */
    public void setPartyService(PartyService partyService) {
        this.partyService = partyService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return RegionService
     */
    public RegionService getRegionService() {
        return regionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param regionService
     */
    public void setRegionService(RegionService regionService) {
        this.regionService = regionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return SupplierService
     */
    public SupplierService getSupplierService() {
        return supplierService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplierService
     */
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Country
     */
    public Country findOne(Long id) {
        return getCountryRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Country> findAll(Iterable<Long> ids) {
        return getCountryRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Country> findAll() {
        return getCountryRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getCountryRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Country> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getCountryRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Country> getEntityType() {
        return Country.class;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Long> getIdType() {
        return Long.class;
    }
}
