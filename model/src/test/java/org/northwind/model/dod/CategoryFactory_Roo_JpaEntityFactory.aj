// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model.dod;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.northwind.model.Category;
import org.northwind.model.dod.CategoryFactory;

privileged aspect CategoryFactory_Roo_JpaEntityFactory {
    
    /**
     * Creates a new {@link Category} with the given index.
     * 
     * @param index position of the Category
     * @return a new transient Category
     */
    public Category CategoryFactory.create(int index) {
        Category obj = new Category();
        setCreatedBy(obj, index);
        setCreatedDate(obj, index);
        setModifiedBy(obj, index);
        setModifiedDate(obj, index);
        return obj;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setCreatedBy(Category obj, int index) {
        String createdBy = "createdBy_" + index;
        obj.setCreatedBy(createdBy);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setCreatedDate(Category obj, int index) {
        Calendar createdDate = Calendar.getInstance();
        obj.setCreatedDate(createdDate);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setModifiedBy(Category obj, int index) {
        String modifiedBy = "modifiedBy_" + index;
        obj.setModifiedBy(modifiedBy);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void CategoryFactory.setModifiedDate(Category obj, int index) {
        Calendar modifiedDate = Calendar.getInstance();
        obj.setModifiedDate(modifiedDate);
    }
    
}