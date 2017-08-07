// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.northwind.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.northwind.model.CustomerOrder;
import org.northwind.model.OrderDetail;
import org.northwind.model.OrderDetail_Roo_Jaxb_Entity;
import org.northwind.model.Product;

privileged aspect OrderDetail_Roo_Jaxb_Entity {
    
    /*
     * This Aspect takes the lower precedence
     */
    declare precedence: *, OrderDetail_Roo_Jaxb_Entity;
    
    declare @type: OrderDetail: @XmlRootElement(name = "orderdetail", namespace = "http://ws.northwind.org/");
    
    declare @method: public CustomerOrder OrderDetail.getCustomerOrder(): @XmlIDREF;
    
    declare @method: public CustomerOrder OrderDetail.getCustomerOrder(): @XmlElement(name = "customerorder");
    
    declare @method: public Product OrderDetail.getProduct(): @XmlIDREF;
    
    declare @method: public Product OrderDetail.getProduct(): @XmlElement(name = "product");
    
    declare @method: public Long OrderDetail.getId(): @XmlTransient;
    
    /**
     * Must return an unique ID across all entities
     * 
     * @return String
     */
    @XmlID
    @XmlAttribute(name = "id")
    public String OrderDetail.getXmlIdentityInfo() {
        return getClass().getName() + ":" + getId();
    }
    
}