package com.cooper.orderService.controller;


import com.cooper.orderService.common.ApiResponse;
import com.cooper.orderService.common.TxnReq;
import com.cooper.orderService.model.Order;
import com.cooper.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {


    @Autowired
    OrderService service;


    @PostMapping("/save/")
    public ApiResponse saveOrder(@RequestBody TxnReq order) {
        System.out.println("Input is "+  order);
        return service.saveOrder(order);
    }
}
