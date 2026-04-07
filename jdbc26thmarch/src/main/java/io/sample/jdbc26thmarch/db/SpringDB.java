package io.sample.jdbc26thmarch.db;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDB {
    private final JdbcTemplate jdbcTemplate;

    public SpringDB(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
