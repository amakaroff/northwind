// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import org.northwind.application.web.PurchaseOrdersItemJsonController;
import org.northwind.service.api.PurchaseOrderService;

privileged aspect PurchaseOrdersItemJsonController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PurchaseOrderService PurchaseOrdersItemJsonController.purchaseOrderService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PurchaseOrderService
     */
    public PurchaseOrderService PurchaseOrdersItemJsonController.getPurchaseOrderService() {
        return purchaseOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrderService
     */
    public void PurchaseOrdersItemJsonController.setPurchaseOrderService(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }
    
}
