// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import io.springlets.data.domain.GlobalSearch;
import org.northwind.model.City;
import org.northwind.model.Region;
import org.northwind.model.Supplier;
import org.northwind.repository.SupplierRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect SupplierRepositoryCustom_Roo_Jpa_Repository_Custom {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Supplier> SupplierRepositoryCustom.findByCity(City city, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Supplier> SupplierRepositoryCustom.findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Supplier> SupplierRepositoryCustom.findAll(GlobalSearch globalSearch, Pageable pageable);
    
}