// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import org.northwind.application.web.ShippersSearchThymeleafController;
import org.northwind.service.api.ShipperService;

privileged aspect ShippersSearchThymeleafController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ShipperService ShippersSearchThymeleafController.shipperService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ShipperService
     */
    public ShipperService ShippersSearchThymeleafController.getShipperService() {
        return shipperService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param shipperService
     */
    public void ShippersSearchThymeleafController.setShipperService(ShipperService shipperService) {
        this.shipperService = shipperService;
    }
    
}
