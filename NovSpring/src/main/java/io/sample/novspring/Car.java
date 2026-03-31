package io.sample.novspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    Engine engine;

     void drive() {
         engine.start();
        System.out.println("car is running");
    }
}
