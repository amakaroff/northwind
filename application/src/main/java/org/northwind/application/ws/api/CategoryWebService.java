package org.northwind.application.ws.api;
import org.northwind.service.api.CategoryService;
import org.springframework.roo.addon.ws.annotations.RooSei;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.domain.jaxb.GlobalSearchAdapter;
import io.springlets.data.domain.jaxb.IterableAdapter;
import io.springlets.data.domain.jaxb.PageAdapter;
import io.springlets.data.domain.jaxb.PageableAdapter;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.apache.cxf.annotations.WSDLDocumentation;
import org.apache.cxf.annotations.WSDLDocumentationCollection;
import org.northwind.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.apache.cxf.annotations.WSDLDocumentation.Placement;

/**
 * = CategoryWebService
 TODO Auto-generated class documentation
 *
 */
@RooSei(service = CategoryService.class)
@WebService(name = "CategoryWebService", targetNamespace = "http://ws.northwind.org/")
@WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = Placement.TOP)
public interface CategoryWebService {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.FindOneByLongRequest", localName = "FindOneByLongRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.FindOneByLongResponse", localName = "FindOneByLongResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:FindOneByLong")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Category findOneByLong(@WebParam(name = "id", targetNamespace = "") Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.DeleteByCategoryRequest", localName = "DeleteByCategoryRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.DeleteByCategoryResponse", localName = "DeleteByCategoryResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:DeleteByCategory")
    @WebResult(name = "void", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract void deleteByCategory(@WebParam(name = "category", targetNamespace = "") Category category);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.SaveByIterableRequest", localName = "SaveByIterableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.SaveByIterableResponse", localName = "SaveByIterableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:SaveByIterable")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract List<Category> saveByIterable(@WebParam(name = "entities", targetNamespace = "") @XmlJavaTypeAdapter(IterableAdapter.class) Iterable<Category> entities);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.DeleteByIterableRequest", localName = "DeleteByIterableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.DeleteByIterableResponse", localName = "DeleteByIterableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:DeleteByIterable")
    @WebResult(name = "void", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract void deleteByIterable(@WebParam(name = "ids", targetNamespace = "") @XmlJavaTypeAdapter(IterableAdapter.class) Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return Category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.SaveByCategoryRequest", localName = "SaveByCategoryRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.SaveByCategoryResponse", localName = "SaveByCategoryResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:SaveByCategory")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Category saveByCategory(@WebParam(name = "entity", targetNamespace = "") Category entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.FindOneForUpdateByLongRequest", localName = "FindOneForUpdateByLongRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.FindOneForUpdateByLongResponse", localName = "FindOneForUpdateByLongResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:FindOneForUpdateByLong")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Category findOneForUpdateByLong(@WebParam(name = "id", targetNamespace = "") Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.FindAllByIterableRequest", localName = "FindAllByIterableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.FindAllByIterableResponse", localName = "FindAllByIterableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:FindAllByIterable")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract List<Category> findAllByIterable(@WebParam(name = "ids", targetNamespace = "") @XmlJavaTypeAdapter(IterableAdapter.class) Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.FindAllRequest", localName = "FindAllRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.FindAllResponse", localName = "FindAllResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:FindAll")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract List<Category> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.CountRequest", localName = "CountRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.CountResponse", localName = "CountResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:Count")
    @WebResult(name = "long", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract long count();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    @XmlJavaTypeAdapter(PageAdapter.class)
    @RequestWrapper(className = "org.northwind.application.ws.api.FindAllByGlobalSearchAndPageableRequest", localName = "FindAllByGlobalSearchAndPageableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.FindAllByGlobalSearchAndPageableResponse", localName = "FindAllByGlobalSearchAndPageableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:FindAllByGlobalSearchAndPageable")
    @WebResult(name = "page", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Page<Category> findAllByGlobalSearchAndPageable(@WebParam(name = "globalSearch", targetNamespace = "") @XmlJavaTypeAdapter(GlobalSearchAdapter.class) GlobalSearch globalSearch, @WebParam(name = "pageable", targetNamespace = "") @XmlJavaTypeAdapter(PageableAdapter.class) Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     * @param productsToAdd
     * @return Category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.AddToProductsByCategoryAndIterableRequest", localName = "AddToProductsByCategoryAndIterableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.AddToProductsByCategoryAndIterableResponse", localName = "AddToProductsByCategoryAndIterableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:AddToProductsByCategoryAndIterable")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Category addToProductsByCategoryAndIterable(@WebParam(name = "category", targetNamespace = "") Category category, @WebParam(name = "productsToAdd", targetNamespace = "") @XmlJavaTypeAdapter(IterableAdapter.class) Iterable<Long> productsToAdd);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     * @param productsToRemove
     * @return Category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.RemoveFromProductsByCategoryAndIterableRequest", localName = "RemoveFromProductsByCategoryAndIterableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.RemoveFromProductsByCategoryAndIterableResponse", localName = "RemoveFromProductsByCategoryAndIterableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:RemoveFromProductsByCategoryAndIterable")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Category removeFromProductsByCategoryAndIterable(@WebParam(name = "category", targetNamespace = "") Category category, @WebParam(name = "productsToRemove", targetNamespace = "") @XmlJavaTypeAdapter(IterableAdapter.class) Iterable<Long> productsToRemove);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     * @param products
     * @return Category
     */
    @RequestWrapper(className = "org.northwind.application.ws.api.SetProductsByCategoryAndIterableRequest", localName = "SetProductsByCategoryAndIterableRequest", targetNamespace = "http://ws.northwind.org/")
    @ResponseWrapper(className = "org.northwind.application.ws.api.SetProductsByCategoryAndIterableResponse", localName = "SetProductsByCategoryAndIterableResponse", targetNamespace = "http://ws.northwind.org/")
    @WebMethod(action = "urn:SetProductsByCategoryAndIterable")
    @WebResult(name = "category", targetNamespace = "")
    @WSDLDocumentationCollection({ @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.DEFAULT), @WSDLDocumentation(value = "TODO Auto-generated documentation for CategoryWebService", placement = WSDLDocumentation.Placement.PORT_TYPE_OPERATION_OUTPUT) })
    public abstract Category setProductsByCategoryAndIterable(@WebParam(name = "category", targetNamespace = "") Category category, @WebParam(name = "products", targetNamespace = "") @XmlJavaTypeAdapter(IterableAdapter.class) Iterable<Long> products);
}
