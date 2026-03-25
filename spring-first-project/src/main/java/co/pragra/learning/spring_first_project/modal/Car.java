package co.pragra.learning.spring_first_project.modal;


import lombok.Data;

@Data
public class Car {
    private Engine engine;
    private String make;
    private String model;

    public Car(Engine engine, String make, String model) {
        this.engine = engine;
        this.make = "Honda";
        this.model = "crv";

    }
    public void init(){
        System.out.println("******car initial");
    }

    public void destroy(){
        System.out.println("car destroy");
    }
}
