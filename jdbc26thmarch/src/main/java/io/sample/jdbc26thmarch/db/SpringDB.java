package io.sample.jdbc26thmarch.db;

import io.sample.jdbc26thmarch.model.TestData;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


//CRUD - CREATE, READ , UPDATE, DELETE
//DDL - Data definition Language --create table, create index, create view
//DML - Data Manipulation Language -- select, insert, update, delete


@Repository
public class SpringDB {
    private final JdbcTemplate jdbcTemplate;

    public SpringDB(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }

    public void printRecord(){
        String sql = "SELECT * FROM TEST";
        List<TestData> data = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TestData.class));
        System.out.println("data = " + data);

    }

    public void createTable(){
        String sql = "CREATE TABLE EMPLOYEE(ID INT PRIMARY KEY, FIRST_NAME VARCHAR(255) , LAST_NAME VARCHAR(225), SALARY DECIMAL(10.2));";
        jdbcTemplate.execute(sql);
    }

    public void createIndex(){
        jdbcTemplate.execute("CREATE INDEX idx_employee_name ON EMPLOYEE(FIRST_NAME);");
    }
}
