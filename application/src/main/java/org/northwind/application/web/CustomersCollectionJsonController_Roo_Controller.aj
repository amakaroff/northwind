// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import org.northwind.application.web.CustomersCollectionJsonController;
import org.northwind.service.api.CustomerService;

privileged aspect CustomersCollectionJsonController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private CustomerService CustomersCollectionJsonController.customerService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CustomerService
     */
    public CustomerService CustomersCollectionJsonController.getCustomerService() {
        return customerService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param customerService
     */
    public void CustomersCollectionJsonController.setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    
}
