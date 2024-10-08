package leekiye.hr_jpa_querydsl.repository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HrmBankIndexRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createBankIndex() {
        String sql = "CREATE INDEX idx_bank_name ON hrm(bank_name)";
        jdbcTemplate.execute(sql);
    }
}
