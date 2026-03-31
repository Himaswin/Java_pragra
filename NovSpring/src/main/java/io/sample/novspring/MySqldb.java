package io.sample.novspring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        name = "Envtype",
        havingValue = "Dev"
)
public class MySqldb {
        @PostConstruct
        void init(){
            System.out.println("Initializing MySqldb");
        }
}
