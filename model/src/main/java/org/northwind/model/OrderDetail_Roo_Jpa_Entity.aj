// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model;

import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import org.northwind.model.OrderDetail;

privileged aspect OrderDetail_Roo_Jpa_Entity {
    
    declare @type: OrderDetail: @Entity;
    
    declare @type: OrderDetail: @EntityFormat;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String OrderDetail.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String OrderDetail.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
