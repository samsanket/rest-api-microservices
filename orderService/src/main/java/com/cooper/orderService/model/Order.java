package com.cooper.orderService.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue()
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "qty")
    Long qty;


    @Column(name = "price")
    Double price;


    public Order() {
    }

    public Order(Long id, String name, Long qty, Double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
