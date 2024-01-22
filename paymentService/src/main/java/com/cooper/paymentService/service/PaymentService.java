package com.cooper.paymentService.service;


import com.cooper.paymentService.model.Payment;
import com.cooper.paymentService.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {


    @Autowired
    PaymentRepo paymentRepo;


    public Payment doPayMent(Payment payment){
        payment.setTxn(UUID.randomUUID().toString());
        payment.setStatus(PaymentService.getPaymentStatus());
        return paymentRepo.save(payment);   
    }

    private static String getPaymentStatus() {
        return new Random().nextBoolean()?"success":"false";
    }
}
