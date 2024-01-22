package com.cooper.orderService.common;

import com.cooper.orderService.model.Order;

public class ApiResponse {

    private Order order;
    private  Payment payment;

    private String  message;

    public ApiResponse(Order order, Payment payment, String message) {
        this.order = order;
        this.payment = payment;
        this.message = message;
    }

    public ApiResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

