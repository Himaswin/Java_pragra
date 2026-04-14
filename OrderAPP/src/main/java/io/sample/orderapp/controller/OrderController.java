package io.sample.orderapp.controller;

import io.sample.orderapp.Entity.OrderEntity;
import io.sample.orderapp.service.OrderService;
import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/allOrders")
    public List<OrderEntity> getAll() {
        return orderService.getAllOrders();
    }

    @PostMapping("/saveOrder")
    public OrderEntity save(@RequestBody OrderEntity order){
        return orderService.saveOrder(order);
    }

    @GetMapping("/getById/{id}")
    public OrderEntity getById(@PathVariable Long id){
        return orderService.getOrderById(id).get();
    }

}
