// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import org.northwind.application.web.SolidProductsCollectionJsonController;
import org.northwind.service.api.SolidProductService;

privileged aspect SolidProductsCollectionJsonController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private SolidProductService SolidProductsCollectionJsonController.solidProductService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return SolidProductService
     */
    public SolidProductService SolidProductsCollectionJsonController.getSolidProductService() {
        return solidProductService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param solidProductService
     */
    public void SolidProductsCollectionJsonController.setSolidProductService(SolidProductService solidProductService) {
        this.solidProductService = solidProductService;
    }
    
}