package io.sample.jpanov;

import io.sample.jpanov.repository.ProductRepo;
import io.sample.jpanov.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaNovApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(JpaNovApplication.class, args);
        ProductService bean = context.getBean(ProductService.class);
//        bean.saveProduct();
        bean.getAllProducts().forEach(System.out::println);
        bean.findProdByID(10L).ifPresent(System.out::println);
        // save -> create and update two queries by hibernate

    }

}
