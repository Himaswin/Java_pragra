package io.sample.jdbc26thmarch;

import io.sample.jdbc26thmarch.db.TraditionalDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class Jdbc26thmarchApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(Jdbc26thmarchApplication.class, args);
        TraditionalDB db = new TraditionalDB();
        db.setUpDbConnection();
    }

}
