package leekiye.hr_jpa_querydsl.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import leekiye.hr_jpa_querydsl.entity.Hrm;
import leekiye.hr_jpa_querydsl.entity.HrmRepositoryCustom;
import leekiye.hr_jpa_querydsl.entity.QHrm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HrmRepositoryCustomImpl implements HrmRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Autowired
    public HrmRepositoryCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    public List<Hrm> findByDept(String deptName) {
        QHrm hrm = QHrm.hrm;
        return queryFactory.selectFrom(hrm)
                .where(hrm.deptName.eq(deptName))
                .fetch();
    }
}
