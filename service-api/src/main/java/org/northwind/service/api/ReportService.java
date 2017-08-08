package org.northwind.service.api;
import org.northwind.model.Report;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.format.EntityResolver;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ReportService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Report.class)
public interface ReportService extends EntityResolver<Report, Long> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Report
     */
    Report findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param report
     */
    void delete(Report report);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entities
     * @return List
     */
    List<Report> save(Iterable<Report> entities);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     */
    void delete(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @param entity
     * @return Report
     */
    Report save(Report entity);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Report
     */
    Report findOneForUpdate(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    List<Report> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    List<Report> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    long count();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    Page<Report> findAll(GlobalSearch globalSearch, Pageable pageable);
}
