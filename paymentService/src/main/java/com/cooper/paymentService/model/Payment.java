package com.cooper.paymentService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {


    @Id
    @GeneratedValue
    private Long id;


    private String status;

    private String txn;


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
}
