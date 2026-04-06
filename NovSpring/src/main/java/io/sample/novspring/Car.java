package io.sample.novspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Service
@Repository
public class Car {

    @Autowired
    Engine engine;

     void drive() {
         engine.start();
        System.out.println("car is running");
    }
}
