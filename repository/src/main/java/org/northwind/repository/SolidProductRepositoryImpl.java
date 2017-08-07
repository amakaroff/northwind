package org.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.northwind.model.SolidProduct;

/**
 * = SolidProductRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = SolidProductRepositoryCustom.class)
public class SolidProductRepositoryImpl extends QueryDslRepositorySupportExt<SolidProduct> {

    /**
     * TODO Auto-generated constructor documentation
     */
    SolidProductRepositoryImpl() {
        super(SolidProduct.class);
    }
}