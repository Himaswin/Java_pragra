package io.sample.novspring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    @PostConstruct
    public void init(){
        System.out.println("init database");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy database");
    }

}
