package org.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.northwind.model.Supplier;

/**
 * = SupplierRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = SupplierRepositoryCustom.class)
public class SupplierRepositoryImpl extends QueryDslRepositorySupportExt<Supplier> {

    /**
     * TODO Auto-generated constructor documentation
     */
    SupplierRepositoryImpl() {
        super(Supplier.class);
    }
}