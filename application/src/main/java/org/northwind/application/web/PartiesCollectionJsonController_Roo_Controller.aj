// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import org.northwind.application.web.PartiesCollectionJsonController;
import org.northwind.service.api.PartyService;

privileged aspect PartiesCollectionJsonController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PartyService PartiesCollectionJsonController.partyService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PartyService
     */
    public PartyService PartiesCollectionJsonController.getPartyService() {
        return partyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partyService
     */
    public void PartiesCollectionJsonController.setPartyService(PartyService partyService) {
        this.partyService = partyService;
    }
    
}
