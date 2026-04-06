package io.sample.springjdbcnov.repo;

import io.sample.springjdbcnov.common.SqlQueries;
import io.sample.springjdbcnov.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Scope(value="prototype")
public class StudentRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    StringBuilder sb = new StringBuilder(SqlQueries.getAllStudents);


    public List<StudentEntity> getAllStudents() {
        StringBuilder sb = new StringBuilder(SqlQueries.getAllStudents);

//        String sql = "select * from student";
       // RowMapper<StudentEntity> rowMapper = new RowMapper<StudentEntity>() {
//            @Override
//            public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
//                StudentEntity entity = new StudentEntity();
//                entity.setId(rs.getInt(1));
//                entity.setFirstName(rs.getString(2));
//                entity.setLastName(rs.getString(3));
//                return entity;
//            }
//        };
//        List<StudentEntity> query = jdbcTemplate.query(sql, rowMapper);
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(StudentEntity.class));
        return jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper<>(StudentEntity.class));

//        for(var ele : query) {
//            System.out.println(ele);
//        }

//        return query;
    }

    public void saveStudent(StudentEntity student) {
        String sql = SqlQueries.saveStudents;
        int update = jdbcTemplate.update(sql, student.getId(), student.getFirstName(), student.getLastName());
        System.out.println("Rows affected: " + update);
    }
}
