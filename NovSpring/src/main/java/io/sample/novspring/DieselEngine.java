package io.sample.novspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
    @Override
    @Qualifier
    public void start() {
        System.out.println("Diesel Engine is started");

    }
}
