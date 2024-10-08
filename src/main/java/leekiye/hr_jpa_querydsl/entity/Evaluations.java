package leekiye.hr_jpa_querydsl.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "evaluations")
@Getter
@Setter
public class Evaluations {
    @Id
    private int evaluationNo;
    private String performanceGrade;
    private int promote;
    private String comments;

    @ManyToOne
    @JoinColumn(name = "empNo", referencedColumnName = "empNo")
    private Hrm hrm;
}
