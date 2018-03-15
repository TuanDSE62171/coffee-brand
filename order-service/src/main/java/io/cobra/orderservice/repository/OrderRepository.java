package io.cobra.orderservice.repository;

import io.cobra.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
    List<Order> findAll();
    
    List<Order> findByStatus(int statusConstant);
}
