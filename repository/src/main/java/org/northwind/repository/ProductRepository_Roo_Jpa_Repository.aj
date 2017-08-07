// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.northwind.model.Supplier;
import org.northwind.repository.ProductRepository;
import org.northwind.repository.ProductRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ProductRepository_Roo_Jpa_Repository {
    
    declare parents: ProductRepository extends DetachableJpaRepository<Product, Long>;
    
    declare parents: ProductRepository extends ProductRepositoryCustom;
    
    declare @type: ProductRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param supplier
     * @return Long
     */
    public abstract long ProductRepository.countBySupplier(Supplier supplier);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param category
     * @return Long
     */
    public abstract long ProductRepository.countByCategory(CustomerOrder category);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param discontinued
     * @param pageable
     * @return Page
     */
    public abstract Page<Product> ProductRepository.findByDiscontinuedOrderByNameAsc(Boolean discontinued, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param discontinued
     * @return Long
     */
    public abstract long ProductRepository.countByDiscontinuedOrderByNameAsc(Boolean discontinued);
    
}