package com.cooper.orderService.common;

import com.cooper.orderService.model.Order;

public class TxnReq {

    private Order order;
    private  Payment payment;

    public TxnReq() {
    }

    public TxnReq(Order order, Payment payment) {
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


    @Override
    public String toString() {
        return "TxnReq{" +
                "order=" + order +
                ", payment=" + payment +
                '}';
    }
}
