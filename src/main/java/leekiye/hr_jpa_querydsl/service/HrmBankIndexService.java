package leekiye.hr_jpa_querydsl.service;

import leekiye.hr_jpa_querydsl.repository.HrmBankIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrmBankIndexService {

    @Autowired
    private HrmBankIndexRepository hrmBankIndexRepository;

    public void createBankIndex() {
        hrmBankIndexRepository.createBankIndex();
    }
}
