// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.Category;
import org.northwind.repository.CategoryRepository;
import org.northwind.repository.CategoryRepositoryCustom;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CategoryRepository_Roo_Jpa_Repository {
    
    declare parents: CategoryRepository extends DetachableJpaRepository<Category, Long>;
    
    declare parents: CategoryRepository extends CategoryRepositoryCustom;
    
    declare @type: CategoryRepository: @Transactional(readOnly = true);
    
}