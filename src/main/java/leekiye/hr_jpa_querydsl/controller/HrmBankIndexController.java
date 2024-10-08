package leekiye.hr_jpa_querydsl.controller;

import leekiye.hr_jpa_querydsl.service.HrmBankIndexService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HrmBankIndexController {

    private final HrmBankIndexService hrmBankIndexService;

    @GetMapping("/create-hrm-bankIndex")
    public String createHrmBankIndex() {
        hrmBankIndexService.createBankIndex();
        return "Hrm Table Bank Index created Successfully ^0^";
    }
}
