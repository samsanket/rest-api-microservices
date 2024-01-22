package com.cooper.orderService.service;

import com.cooper.orderService.model.Order;
import com.cooper.orderService.repo.OrderRepo;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {


    @Autowired
    OrderRepo orderRepo;



    public Order saveOrder(Order order){
       return orderRepo.save(order);
    }
}
