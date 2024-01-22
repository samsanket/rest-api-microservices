package com.cooper.paymentService.controller;

import com.cooper.paymentService.model.Payment;
import com.cooper.paymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {


    @Autowired
    PaymentService service;


    @PostMapping("/save")
    public Payment savePaymnet(@RequestBody Payment payment){
        return  service.doPayMent(payment);
    }

}
