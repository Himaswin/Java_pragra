package co.pragra.learning.spring_first_project.conf;

import co.pragra.learning.spring_first_project.modal.Car;
import co.pragra.learning.spring_first_project.modal.ElectricEngine;
import co.pragra.learning.spring_first_project.modal.GasolineEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:car.properties")
public class AppConfig {

    @Value("#{'${tags}'.split(',')}")
    private List<String> tags = new ArrayList<String>();

    @Bean
    public GasolineEngine gasolineEngine(){
        GasolineEngine gasolineEngine = new GasolineEngine();
        gasolineEngine.setTags(tags);
        return gasolineEngine;
    }

    @Bean
    public ElectricEngine electricEngine(){
        return new ElectricEngine();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car(@Value("${make}") String make, @Value("${model") String model, @Value("${engine.type}") String type){
        return new Car(type.equalsIgnoreCase("electric")? electricEngine():gasolineEngine(),make,model);
    }
}
