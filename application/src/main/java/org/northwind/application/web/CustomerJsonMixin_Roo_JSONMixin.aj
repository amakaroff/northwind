// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import org.northwind.application.web.CustomerJsonMixin;
import org.northwind.model.CustomerOrder;

privileged aspect CustomerJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<CustomerOrder> CustomerJsonMixin.customerOrders;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<CustomerOrder> CustomerJsonMixin.getCustomerOrders() {
        return customerOrders;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerOrders
     */
    public void CustomerJsonMixin.setCustomerOrders(Set<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }
    
}
