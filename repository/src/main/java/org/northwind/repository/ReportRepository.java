package org.northwind.repository;
import org.northwind.model.Report;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ReportRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Report.class)
@Transactional(readOnly = true)
public interface ReportRepository extends DetachableJpaRepository<Report, Long>, ReportRepositoryCustom {
}
