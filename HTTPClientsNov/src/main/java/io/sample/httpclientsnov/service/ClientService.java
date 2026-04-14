package io.sample.httpclientsnov.service;

import io.sample.httpclientsnov.dto.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClientService {

    RestTemplate restTemplate = new RestTemplate();
    public List<Order> getAllOrders(){
        return restTemplate.getForObject("http://localhost:7030/order/allOrders", List.class);
    }

    public Order getOrderById(Long id){
        return restTemplate.getForObject("http://localhost:7030/order/getById/"+id, Order.class);
    }
}
