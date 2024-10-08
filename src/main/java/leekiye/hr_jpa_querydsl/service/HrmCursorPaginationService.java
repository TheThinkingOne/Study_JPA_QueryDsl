package leekiye.hr_jpa_querydsl.service;

import leekiye.hr_jpa_querydsl.entity.Hrm;
import leekiye.hr_jpa_querydsl.repository.HrmCursorPaginationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HrmCursorPaginationService {

    private final HrmCursorPaginationRepository hrmCursorPaginationRepository;

    public List<Hrm> getEmployeesAfter(Long lastEmpNo, int size) {
        Pageable pageable = PageRequest.of(0, size);
        return hrmCursorPaginationRepository.findByEmpNoGreaterThan(lastEmpNo, pageable);

    }

}
