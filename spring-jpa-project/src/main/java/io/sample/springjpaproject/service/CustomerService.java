package io.sample.springjpaproject.service;

import io.sample.springjpaproject.entity.Customer;
import io.sample.springjpaproject.repo.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepo repo;

    public CustomerService(CustomerRepo repo){
        this.repo = repo;
    }

    public Customer create(Customer customer) throws IllegalAccessException {
        if(customer == null){
            throw new IllegalAccessException("Customer cannot be null");
        }
        if(customer.getEmail() == null){
            throw new IllegalArgumentException("Customer email cannot be null");
        }
        customer.setCreationDate(new Date());
        return repo.save(customer);
    }

    public List<Customer> getAll(){
        return repo.findAll();
    }

    public Customer update(Customer customer){
        if(customer == null || customer.getId() == null){
            throw new IllegalArgumentException("Customer cannot be null");
        }
        return repo.save(customer);
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }


    public Optional<Customer> getCustomerById(int customerId) {
        return repo.findById(customerId);
    }
}
