// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import static org.assertj.core.api.Assertions.assertThat;

import io.springlets.data.domain.GlobalSearch;
import java.util.Iterator;
import java.util.List;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.northwind.model.Customer;
import org.northwind.model.CustomerInfo;
import org.northwind.model.dod.CustomerDataOnDemand;
import org.northwind.repository.CustomerRepository;
import org.northwind.repository.CustomerRepositoryIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

privileged aspect CustomerRepositoryIT_Roo_RepositoryJpaIntegrationTest {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Rule
    public ExpectedException CustomerRepositoryIT.thrown = ExpectedException.none();
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Autowired
    private CustomerRepository CustomerRepositoryIT.repository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Autowired
    private CustomerDataOnDemand CustomerRepositoryIT.dod;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerRepository
     */
    public CustomerRepository CustomerRepositoryIT.getRepository() {
        return repository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerDataOnDemand
     */
    public CustomerDataOnDemand CustomerRepositoryIT.getDod() {
        return dod;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Before
    public void CustomerRepositoryIT.checkDataOnDemandHasInitializedCorrectly() {
        assertThat(getDod().getRandomCustomer())
            .as("Check data on demand for 'Customer' initializes correctly by getting a random Customer")
            .isNotNull();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.countShouldReturnExpectedValue() {
        // Verify
        assertThat(getRepository().count()).as("Check there are available 'Customer' entries").isGreaterThan(0);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.findOneShouldReturnExistingCustomer() {
        // Setup
        Long id = getRandomCustomerId();
        
        // Exercise
        Customer customer = getRepository().findOne(id);
        
        // Verify
        assertThat(customer).as("Check that findOne illegally returned null for id %s", id).isNotNull();
        assertThat(id).as("Check the identifier of the found 'Customer' is the same used to look for it")
            .isEqualTo(customer.getId());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.findAllShouldReturnAllCustomers() {
        // Setup
        assertThat(getRepository().count())
            .as("Check the number of entries is not too big (250 entries). "
                + "If it is, please review the tests so it doesn't take too long to run them")
            .isLessThan(250);
        
        // Exercise
        List<Customer> result = getRepository().findAll();
        
        // Verify
        assertThat(result).as("Check 'findAll' returns a not null list of entries").isNotNull();
        assertThat(result.size()).as("Check 'findAll' returns a not empty list of entries")
            .isGreaterThan(0);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.persistShouldGenerateIdValue() {
        // Setup
        // Exercise
        Customer customer = getDod().getNewRandomTransientCustomer();
        
        // Verify
        assertThat(customer).as("Check the Data on demand generated a new non null 'Customer'").isNotNull();
        assertThat(customer.getId()).as("Check the Data on demand generated a new 'Customer' whose id is null")
            .isNull();
        try {
            customer = getRepository().saveAndFlush(customer);
        } catch (final ConstraintViolationException e) {
            final StringBuilder msg = new StringBuilder();
            for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter
                .hasNext();) {
                final ConstraintViolation<?> cv = iter.next();
                msg.append("[").append(cv.getRootBean().getClass().getName()).append(".")
                    .append(cv.getPropertyPath()).append(": ").append(cv.getMessage())
                    .append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
            }
            throw new IllegalStateException(msg.toString(), e);
        }
        assertThat(customer.getId()).as("Check a 'Customer' (%s) id is not null after been persisted", customer)
            .isNotNull();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.deleteShouldMakeCustomerUnavailable() {
        // Setup
        Long id = getRandomCustomerId();
        Customer customer = getRepository().findOne(id);
        
        // Exercise
        getRepository().delete(customer);
        
        // Verify
        assertThat(getRepository().findOne(id))
        .as("Check the deleted 'Customer' %s is no longer available with 'findOne'", customer).isNull();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.findAllCustomNotFilteredNotPagedShouldReturnAllCustomers() {
        // Exercise
        Page<CustomerInfo> all = getRepository().findAll((GlobalSearch) null, new PageRequest(0, getDod().getSize()));
        
        // Verify
        assertThat(all.getNumberOfElements())
            .as("Check 'findAll' with null 'GlobalSearch' and no pagination returns all entries")
            .isEqualTo(getDod().getSize());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void CustomerRepositoryIT.findAllCustomNotFilteredPagedShouldReturnACustomersPage() {
        // Exercise
        Page<CustomerInfo> all = getRepository().findAll((GlobalSearch) null, new PageRequest(0, 3));
        
        // Verify
        assertThat(all.getNumberOfElements())
            .as("Check result number is not greater than the page size").isLessThanOrEqualTo(3);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    private Long CustomerRepositoryIT.getRandomCustomerId() {
        Customer customer = getDod().getRandomCustomer();
        Long id = customer.getId();
        assertThat(id).as("Check the Data on demand generated a 'Customer' with an identifier").isNotNull();
        return id;
    }
    
}
