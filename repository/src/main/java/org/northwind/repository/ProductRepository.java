package org.northwind.repository;
import org.northwind.model.Product;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.northwind.model.Category;
import org.northwind.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProductRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Product.class, finders = { @RooFinder(value = "findByDiscontinuedOrderByNameAsc", returnType = Product.class) })
@Transactional(readOnly = true)
public interface ProductRepository extends DetachableJpaRepository<Product, Long>, ProductRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param supplier
     * @return Long
     */
    long countBySupplier(Supplier supplier);

    /**
     * TODO Auto-generated method documentation
     *
     * @param category
     * @return Long
     */
    long countByCategory(Category category);

    /**
     * TODO Auto-generated method documentation
     *
     * @param discontinued
     * @param pageable
     * @return Page
     */
    Page<Product> findByDiscontinuedOrderByNameAsc(Boolean discontinued, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param discontinued
     * @return Long
     */
    long countByDiscontinuedOrderByNameAsc(Boolean discontinued);
}
