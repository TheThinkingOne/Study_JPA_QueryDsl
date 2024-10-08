package leekiye.hr_jpa_querydsl.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "salary")
@Getter
@Setter
public class Salary {
    @Id
    private Long salaryNo;
    private String accountingPeriod;
    private Double salary;
    // getter, setter

    @ManyToOne
    @JoinColumn(name = "empNo", referencedColumnName = "empNo")
    private Hrm hrm; // 외래키로 HRM 테이블의 empNo 연결
}
