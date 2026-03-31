package io.sample.novspring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        name = "paytype",
        havingValue = "UAT"
)
public class DummyStripe {

    @PostConstruct
    void init(){
        System.out.println("Using Dummy stripe as payment");
    }
}
