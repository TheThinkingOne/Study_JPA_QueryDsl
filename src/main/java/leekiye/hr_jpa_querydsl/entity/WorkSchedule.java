package leekiye.hr_jpa_querydsl.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "work_schedule")
@Getter
@Setter
public class WorkSchedule {
    @Id
    private Long workIdx;
    private String workDate;
    private String status;
    // getter, setter

    @ManyToOne
    @JoinColumn(name = "empNo", referencedColumnName = "empNo")
    private Hrm hrm; // 외래키로 empNo 연결

}