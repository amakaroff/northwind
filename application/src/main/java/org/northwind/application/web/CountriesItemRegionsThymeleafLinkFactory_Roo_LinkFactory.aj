// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import io.springlets.web.mvc.util.MethodLinkFactory;
import io.springlets.web.mvc.util.SpringletsMvcUriComponentsBuilder;
import java.util.Map;
import org.northwind.application.web.CountriesItemRegionsThymeleafController;
import org.northwind.application.web.CountriesItemRegionsThymeleafLinkFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;

privileged aspect CountriesItemRegionsThymeleafLinkFactory_Roo_LinkFactory {
    
    declare parents: CountriesItemRegionsThymeleafLinkFactory implements MethodLinkFactory<CountriesItemRegionsThymeleafController>;
    
    declare @type: CountriesItemRegionsThymeleafLinkFactory: @Component;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CountriesItemRegionsThymeleafLinkFactory.DATATABLES = "datatables";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String CountriesItemRegionsThymeleafLinkFactory.CREATEFORM = "createForm";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<CountriesItemRegionsThymeleafController> CountriesItemRegionsThymeleafLinkFactory.getControllerClass() {
        return CountriesItemRegionsThymeleafController.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param methodName
     * @param parameters
     * @param pathVariables
     * @return UriComponents
     */
    public UriComponents CountriesItemRegionsThymeleafLinkFactory.toUri(String methodName, Object[] parameters, Map<String, Object> pathVariables) {
        if (methodName.equals(DATATABLES)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).datatables(null, null, null, null, null)).buildAndExpand(pathVariables);
        }
        if (methodName.equals(CREATEFORM)) {
            return SpringletsMvcUriComponentsBuilder.fromMethodCall(SpringletsMvcUriComponentsBuilder.on(getControllerClass()).createForm(null, null)).buildAndExpand(pathVariables);
        }
        throw new IllegalArgumentException("Invalid method name: " + methodName);
    }
    
}
