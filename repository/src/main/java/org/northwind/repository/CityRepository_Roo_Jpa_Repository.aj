// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import org.northwind.model.City;
import org.northwind.model.Region;
import org.northwind.repository.CityRepository;
import org.northwind.repository.CityRepositoryCustom;
import org.northwind.repository.ReadOnlyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CityRepository_Roo_Jpa_Repository {
    
    declare parents: CityRepository extends ReadOnlyRepository<City, Long>;
    
    declare parents: CityRepository extends CityRepositoryCustom;
    
    declare @type: CityRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @return Long
     */
    public abstract long CityRepository.countByRegion(Region region);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param pageable
     * @return Page
     */
    public abstract Page<City> CityRepository.findByRegionIdOrderByDescriptionAsc(Long id, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Long
     */
    public abstract long CityRepository.countByRegionIdOrderByDescriptionAsc(Long id);
    
}