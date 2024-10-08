package leekiye.hr_jpa_querydsl.repository;

import leekiye.hr_jpa_querydsl.entity.Hrm;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrmCursorPaginationRepository extends JpaRepository<Hrm, Long> {
    @Query("SELECT  FROM Hrm h WHERE h.empNo > :lastEmpNo ORDER BY h.empNo ASC")
    List<Hrm> findByEmpNoGreaterThan(Long lastEmpNo, Pageable pageable);
}
