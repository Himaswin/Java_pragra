package io.sample.jdbc26thmarch;

import io.sample.jdbc26thmarch.db.SpringDB;
import io.sample.jdbc26thmarch.db.TraditionalDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class Jdbc26thmarchApplication {

    public static void main(String[] args) throws SQLException {

        ConfigurableApplicationContext context = SpringApplication.run(Jdbc26thmarchApplication.class, args);
        SpringDB bean = context.getBean(SpringDB.class);
        bean.printRecord();
//        bean.createTable();
        bean.createIndex();


        //Non spring way
//        SpringApplication.run(Jdbc26thmarchApplication.class, args);
//        TraditionalDB db = new TraditionalDB();
//        db.setUpDbConnection();
    }

}
