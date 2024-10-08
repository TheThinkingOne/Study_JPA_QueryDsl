package leekiye.hr_jpa_querydsl.controller;

import leekiye.hr_jpa_querydsl.entity.Hrm;
import leekiye.hr_jpa_querydsl.service.HrmCursorPaginationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class HrmCursorPaginationController {

    private final HrmCursorPaginationService hrmCursorPaginationService;

    @GetMapping("/cursor-pagination")
    public ResponseEntity<List<Hrm>> getEmployeeCursorPagination(
            @RequestParam Long lastEmpNo,
            @RequestParam int size) {
        List<Hrm> employees = hrmCursorPaginationService.getEmployeesAfter(lastEmpNo, size);
        return ResponseEntity.ok(employees);
    }

}
