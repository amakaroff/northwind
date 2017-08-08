package org.northwind.model.dod;
import org.northwind.model.Product;
import org.springframework.roo.addon.jpa.annotations.dod.RooJpaDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * = ProductDataOnDemand
 TODO Auto-generated class documentation
 *
 */
@RooJpaDataOnDemand(entity = Product.class)
@Configurable
public class ProductDataOnDemand {

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param entityManager
     */
    public ProductDataOnDemand(EntityManager entityManager) {
        this(entityManager, 10);
    }

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param entityManager
     * @param size
     */
    public ProductDataOnDemand(EntityManager entityManager, int size) {
        setEntityManager(entityManager);
        setSize(size);
    }
}
