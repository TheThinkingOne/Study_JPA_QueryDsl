package leekiye.hr_jpa_querydsl.controller;

import leekiye.hr_jpa_querydsl.service.HrmService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HrmController {

    private final HrmService hrmService;

    @GetMapping("/insert-hrm-data")
    public String insertHrmData() {
        hrmService.insertMillionData();
        return "Inserting million data started";
    }

}
