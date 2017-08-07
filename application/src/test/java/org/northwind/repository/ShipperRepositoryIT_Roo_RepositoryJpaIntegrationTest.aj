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
import org.junit.runner.RunWith;
import org.northwind.application.config.SpringDataJpaDetachableRepositoryConfiguration;
import org.northwind.model.Shipper;
import org.northwind.model.dod.DataOnDemandConfiguration;
import org.northwind.model.dod.ShipperDataOnDemand;
import org.northwind.repository.ShipperRepository;
import org.northwind.repository.ShipperRepositoryIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

privileged aspect ShipperRepositoryIT_Roo_RepositoryJpaIntegrationTest {
    
    declare @type: ShipperRepositoryIT: @RunWith(SpringRunner.class);
    
    declare @type: ShipperRepositoryIT: @DataJpaTest;
    
    declare @type: ShipperRepositoryIT: @Import({ DataOnDemandConfiguration.class, SpringDataJpaDetachableRepositoryConfiguration.class });
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Rule
    public ExpectedException ShipperRepositoryIT.thrown = ExpectedException.none();
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Autowired
    private ShipperRepository ShipperRepositoryIT.repository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @Autowired
    private ShipperDataOnDemand ShipperRepositoryIT.dod;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ShipperRepository
     */
    public ShipperRepository ShipperRepositoryIT.getRepository() {
        return repository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ShipperDataOnDemand
     */
    public ShipperDataOnDemand ShipperRepositoryIT.getDod() {
        return dod;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Before
    public void ShipperRepositoryIT.checkDataOnDemandHasInitializedCorrectly() {
        assertThat(getDod().getRandomShipper())
            .as("Check data on demand for 'Shipper' initializes correctly by getting a random Shipper")
            .isNotNull();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void ShipperRepositoryIT.countShouldReturnExpectedValue() {
        // Verify
        assertThat(getRepository().count()).as("Check there are available 'Shipper' entries").isGreaterThan(0);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void ShipperRepositoryIT.findOneShouldReturnExistingShipper() {
        // Setup
        Long id = getRandomShipperId();
        
        // Exercise
        Shipper shipper = getRepository().findOne(id);
        
        // Verify
        assertThat(shipper).as("Check that findOne illegally returned null for id %s", id).isNotNull();
        assertThat(id).as("Check the identifier of the found 'Shipper' is the same used to look for it")
            .isEqualTo(shipper.getId());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void ShipperRepositoryIT.findAllShouldReturnAllShippers() {
        // Setup
        assertThat(getRepository().count())
            .as("Check the number of entries is not too big (250 entries). "
                + "If it is, please review the tests so it doesn't take too long to run them")
            .isLessThan(250);
        
        // Exercise
        List<Shipper> result = getRepository().findAll();
        
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
    public void ShipperRepositoryIT.persistShouldGenerateIdValue() {
        // Setup
        // Exercise
        Shipper shipper = getDod().getNewRandomTransientShipper();
        
        // Verify
        assertThat(shipper).as("Check the Data on demand generated a new non null 'Shipper'").isNotNull();
        assertThat(shipper.getId()).as("Check the Data on demand generated a new 'Shipper' whose id is null")
            .isNull();
        try {
            shipper = getRepository().saveAndFlush(shipper);
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
        assertThat(shipper.getId()).as("Check a 'Shipper' (%s) id is not null after been persisted", shipper)
            .isNotNull();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void ShipperRepositoryIT.deleteShouldMakeShipperUnavailable() {
        // Setup
        Long id = getRandomShipperId();
        Shipper shipper = getRepository().findOne(id);
        
        // Exercise
        getRepository().delete(shipper);
        
        // Verify
        assertThat(getRepository().findOne(id))
        .as("Check the deleted 'Shipper' %s is no longer available with 'findOne'", shipper).isNull();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     */
    @Test
    public void ShipperRepositoryIT.findAllCustomNotFilteredNotPagedShouldReturnAllShippers() {
        // Exercise
        Page<Shipper> all = getRepository().findAll((GlobalSearch) null, new PageRequest(0, getDod().getSize()));
        
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
    public void ShipperRepositoryIT.findAllCustomNotFilteredPagedShouldReturnAShippersPage() {
        // Exercise
        Page<Shipper> all = getRepository().findAll((GlobalSearch) null, new PageRequest(0, 3));
        
        // Verify
        assertThat(all.getNumberOfElements())
            .as("Check result number is not greater than the page size").isLessThanOrEqualTo(3);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    private Long ShipperRepositoryIT.getRandomShipperId() {
        Shipper shipper = getDod().getRandomShipper();
        Long id = shipper.getId();
        assertThat(id).as("Check the Data on demand generated a 'Shipper' with an identifier").isNotNull();
        return id;
    }
    
}
