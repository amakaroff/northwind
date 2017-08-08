// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model.dod;

import org.northwind.model.City;
import org.northwind.model.Country;
import org.northwind.model.Employee;
import org.northwind.model.Region;
import org.northwind.model.dod.EmployeeFactory;

privileged aspect EmployeeFactory_Roo_JpaEntityFactory {
    
    /**
     * Creates a new {@link Employee} with the given index.
     * 
     * @param index position of the Employee
     * @return a new transient Employee
     */
    public Employee EmployeeFactory.create(int index) {
        Employee obj = new Employee();
        setAddress(obj, index);
        setCity(obj, index);
        setCountry(obj, index);
        setPhone(obj, index);
        setPostalCode(obj, index);
        setRegion(obj, index);
        return obj;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void EmployeeFactory.setAddress(Employee obj, int index) {
        String address = "address_" + index;
        obj.setAddress(address);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void EmployeeFactory.setCity(Employee obj, int index) {
        City city = null;
        obj.setCity(city);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void EmployeeFactory.setCountry(Employee obj, int index) {
        Country country = null;
        obj.setCountry(country);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void EmployeeFactory.setPhone(Employee obj, int index) {
        String phone = "phone_" + index;
        obj.setPhone(phone);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void EmployeeFactory.setPostalCode(Employee obj, int index) {
        String postalCode = "postalCode_" + index;
        obj.setPostalCode(postalCode);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param obj
     * @param index
     */
    public void EmployeeFactory.setRegion(Employee obj, int index) {
        Region region = null;
        obj.setRegion(region);
    }
    
}
