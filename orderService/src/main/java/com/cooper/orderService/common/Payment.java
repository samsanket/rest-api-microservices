package com.cooper.orderService.common;

public class Payment {
    private Long id;
    private String status;
    private String txn;
    private Long orderId;
    private Double ammount;

    public Payment(Long id, String status, String txn, Long orderId, Double ammount) {
        this.id = id;
        this.status = status;
        this.txn = txn;
        this.orderId = orderId;
        this.ammount = ammount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getAmmount() {
        return ammount;
    }

    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }

    public Payment() {
    }

    public Payment(Long id, String status, String txn) {
        this.id = id;
        this.status = status;
        this.txn = txn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", txn='" + txn + '\'' +
                ", orderId=" + orderId +
                ", ammount=" + ammount +
                '}';
    }
}
