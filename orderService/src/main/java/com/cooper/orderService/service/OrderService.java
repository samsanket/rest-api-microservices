package com.cooper.orderService.service;

import com.cooper.orderService.common.ApiResponse;
import com.cooper.orderService.common.Payment;
import com.cooper.orderService.common.TxnReq;
import com.cooper.orderService.model.Order;
import com.cooper.orderService.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {


    @Autowired
    OrderRepo orderRepo;


    @Autowired
    RestTemplate template;


    public ApiResponse saveOrder(TxnReq txnReq){
        Order order=orderRepo.save(txnReq.getOrder());

        Payment payment=txnReq.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmmount(order.getPrice());

        String url="http://localhost:9192/api/v1/payment/save";

        Payment postForObject = template.postForObject(url, payment, Payment.class);
        String message="";
        if (!postForObject.getStatus().equals("success")){
            message="Fail Please try again";
        }
        return new ApiResponse(order,postForObject,message);
    }
}
