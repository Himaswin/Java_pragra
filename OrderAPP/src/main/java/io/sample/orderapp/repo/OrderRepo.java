package io.sample.orderapp.repo;

import io.sample.orderapp.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Long> {
}
