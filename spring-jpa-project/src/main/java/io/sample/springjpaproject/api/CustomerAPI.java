package io.sample.springjpaproject.api;

import io.sample.springjpaproject.entity.Customer;
import io.sample.springjpaproject.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerAPI {
    private final CustomerService service;

    public CustomerAPI(CustomerService service){
        this.service = service;
    }

    @PostMapping("/api/customers")
    public Customer createCustomer(@RequestBody Customer customer) throws IllegalAccessException {
        return service.create(customer);
    }

    @GetMapping("/api/customers")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/api/customers")
    public void delete(@RequestBody Customer customer){
         service.delete(customer.getId());
    }

    @PutMapping("/api/customers")
    public void update(@RequestBody Customer customer){
        service.update(customer);
    }
}
