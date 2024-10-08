package leekiye.hr_jpa_querydsl.service;

import leekiye.hr_jpa_querydsl.repository.HrmInsertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrmService {

    @Autowired
    private HrmInsertRepository hrmInsertRepository;

    public void insertMillionData() {
        hrmInsertRepository.callInsertMillionDataProcedure();
    }
}
