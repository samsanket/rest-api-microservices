package com.cooper.paymentService.service;


import com.cooper.paymentService.model.Payment;
import com.cooper.paymentService.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {


    @Autowired
    PaymentRepo paymentRepo;


    public Payment doPayMent(Payment payment){
        payment.setTxn(UUID.randomUUID().toString());

        return paymentRepo.save(payment);
    }
}
