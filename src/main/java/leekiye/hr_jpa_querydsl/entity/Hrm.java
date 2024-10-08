package leekiye.hr_jpa_querydsl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "hrm")
public class Hrm {
    @Id
/*    @Column(name = "emp_no ")*/
    private Long empNo;
    private String ename;
    private String deptName;
    private String posName;
    private String roleName;
    private String mobile;
    private String email;
    private String bankName;
    private String account;
    private String address;
}


