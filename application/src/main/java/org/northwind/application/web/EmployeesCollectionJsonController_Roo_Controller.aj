// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.application.web;

import org.northwind.application.web.EmployeesCollectionJsonController;
import org.northwind.service.api.EmployeeService;

privileged aspect EmployeesCollectionJsonController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EmployeeService EmployeesCollectionJsonController.employeeService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EmployeeService
     */
    public EmployeeService EmployeesCollectionJsonController.getEmployeeService() {
        return employeeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employeeService
     */
    public void EmployeesCollectionJsonController.setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
}
