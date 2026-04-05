package io.sample.springjdbcnov.repo;

import io.sample.springjdbcnov.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<StudentEntity> getAllStudents() {
        String sql = "select * from student";
        RowMapper<StudentEntity> rowMapper = new RowMapper<StudentEntity>() {
            @Override
            public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
                StudentEntity entity = new StudentEntity();
                entity.setId(rs.getInt(1));
                entity.setFirstName(rs.getString(2));
                entity.setLastName(rs.getString(3));
                return entity;
            }
        };
        List<StudentEntity> query = jdbcTemplate.query(sql, rowMapper);
        for(var ele : query) {
            System.out.println(ele);
        }

        return query;
    }
}
