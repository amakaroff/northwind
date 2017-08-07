// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.northwind.model.Category;
import org.northwind.model.QCategory;
import org.northwind.repository.CategoryRepositoryCustom;
import org.northwind.repository.CategoryRepositoryImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CategoryRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare parents: CategoryRepositoryImpl implements CategoryRepositoryCustom;
    
    declare @type: CategoryRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Category> CategoryRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QCategory category = QCategory.category;
        
        JPQLQuery<Category> query = from(category);
        
        Path<?>[] paths = new Path<?>[] {};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper();
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, category);
    }
    
}