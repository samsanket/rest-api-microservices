package com.cooper.orderService.common;

import com.cooper.orderService.model.Order;

public class OrdersResponse {


    private Order order;
    private  Payment payment;

    public OrdersResponse() {
    }

    public OrdersResponse(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
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
