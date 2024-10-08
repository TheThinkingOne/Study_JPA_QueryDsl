package leekiye.hr_jpa_querydsl.repository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HrmInsertRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void callInsertMillionDataProcedure() {
        String sql = "CALL InsertMillionData()";
        jdbcTemplate.execute(sql);
    }
}
