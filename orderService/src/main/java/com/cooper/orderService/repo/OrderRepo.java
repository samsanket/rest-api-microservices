package com.cooper.orderService.repo;

import com.cooper.orderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
