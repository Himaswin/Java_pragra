package io.sample.novms1.controller;

import io.sample.novms1.entity.Order;
import io.sample.novms1.repo.OrderRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderService {

    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderService) {
        orderRepo = orderService;
    }

    @PostMapping("/submit")
    public ResponseEntity<Order> submitOrder(@RequestBody Order order){
        return ResponseEntity.ok().body(orderRepo.save(order));
    }

    @GetMapping("/get/{id}")
    public Optional<Order> getById(@PathVariable Long id){
        return OrderRepo.findById(id);
    }

    @GetMapping("getAll")
    public List<Order> getAll(){
        return orderRepo.
    }

}
