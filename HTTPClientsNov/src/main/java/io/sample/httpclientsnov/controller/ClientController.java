package io.sample.httpclientsnov.controller;

import io.sample.httpclientsnov.dto.Order;
import io.sample.httpclientsnov.service.ClientService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping()
    public List<Order> get(){
        return clientService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id){
        return clientService.getOrderById(id);
    }
}
