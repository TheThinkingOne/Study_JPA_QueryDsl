package leekiye.hr_jpa_querydsl.entity;

import java.util.List;

public interface HrmRepositoryCustom {
    List<Hrm> findByDept(String deptName);
}
