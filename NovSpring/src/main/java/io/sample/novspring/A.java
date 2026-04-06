package io.sample.novspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// this result in circular dependency so use @lazy in one of the class to make a workaround
@Component
public class A {
    @Autowired
    B b;
}

@Component
class B {
    @Autowired
    @Lazy
    A a;
}
