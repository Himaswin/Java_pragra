package io.sample.orderapp.service;

import io.sample.orderapp.Entity.OrderEntity;
import io.sample.orderapp.repo.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public OrderEntity saveOrder(OrderEntity orderEntity) {
        return orderRepo.save(orderEntity);
    }
    public List<OrderEntity> getAllOrders() {
        return orderRepo.findAll();
    }
    public Optional<OrderEntity> getOrderById(Long id) {
        return orderRepo.findById(id);
    }
}
