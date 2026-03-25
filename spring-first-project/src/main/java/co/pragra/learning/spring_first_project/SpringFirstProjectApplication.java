package co.pragra.learning.spring_first_project;

import co.pragra.learning.spring_first_project.conf.AppConfig;
import co.pragra.learning.spring_first_project.modal.Car;
import co.pragra.learning.spring_first_project.modal.Engine;
import co.pragra.learning.spring_first_project.modal.GasolineEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("co.pragra.learning.spring_first_project");
		Car car = context.getBean("car", Car.class);
		System.out.println("car " + car);
		context.registerShutdownHook();
		System.out.println("context is closed");

	}
}


