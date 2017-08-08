package org.northwind.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.northwind.model.OrderDetail;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.northwind.model.CustomerOrder;
import org.northwind.model.Product;
import org.northwind.model.QOrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = OrderDetailRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = OrderDetailRepositoryCustom.class)
@Transactional(readOnly = true)
public class OrderDetailRepositoryImpl extends QueryDslRepositorySupportExt<OrderDetail> implements OrderDetailRepositoryCustom {

    /**
     * TODO Auto-generated constructor documentation
     */
    OrderDetailRepositoryImpl() {
        super(OrderDetail.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String QUANTITY = "quantity";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String CUSTOMER_ORDER = "customerOrder";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String PRODUCT = "product";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String UNIT_PRICE = "unitPrice";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String DISCOUNT = "discount";

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<OrderDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
        QOrderDetail orderDetail = QOrderDetail.orderDetail;
        JPQLQuery<OrderDetail> query = from(orderDetail);
        Path<?>[] paths = new Path<?>[] { orderDetail.customerOrder, orderDetail.unitPrice, orderDetail.quantity, orderDetail.discount, orderDetail.product };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CUSTOMER_ORDER, orderDetail.customerOrder).map(UNIT_PRICE, orderDetail.unitPrice).map(QUANTITY, orderDetail.quantity).map(DISCOUNT, orderDetail.discount).map(PRODUCT, orderDetail.product);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, orderDetail);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param customerOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<OrderDetail> findByCustomerOrder(CustomerOrder customerOrder, GlobalSearch globalSearch, Pageable pageable) {
        QOrderDetail orderDetail = QOrderDetail.orderDetail;
        JPQLQuery<OrderDetail> query = from(orderDetail);
        Assert.notNull(customerOrder, "customerOrder is required");
        query.where(orderDetail.customerOrder.eq(customerOrder));
        Path<?>[] paths = new Path<?>[] { orderDetail.customerOrder, orderDetail.unitPrice, orderDetail.quantity, orderDetail.discount, orderDetail.product };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CUSTOMER_ORDER, orderDetail.customerOrder).map(UNIT_PRICE, orderDetail.unitPrice).map(QUANTITY, orderDetail.quantity).map(DISCOUNT, orderDetail.discount).map(PRODUCT, orderDetail.product);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, orderDetail);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param product
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<OrderDetail> findByProduct(Product product, GlobalSearch globalSearch, Pageable pageable) {
        QOrderDetail orderDetail = QOrderDetail.orderDetail;
        JPQLQuery<OrderDetail> query = from(orderDetail);
        Assert.notNull(product, "product is required");
        query.where(orderDetail.product.eq(product));
        Path<?>[] paths = new Path<?>[] { orderDetail.customerOrder, orderDetail.unitPrice, orderDetail.quantity, orderDetail.discount, orderDetail.product };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CUSTOMER_ORDER, orderDetail.customerOrder).map(UNIT_PRICE, orderDetail.unitPrice).map(QUANTITY, orderDetail.quantity).map(DISCOUNT, orderDetail.discount).map(PRODUCT, orderDetail.product);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, orderDetail);
    }
}
