package com.javaweb.test_module4_final.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private LocalDateTime orderDate;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id")
    private Product product;


    public double getTotalPrice() {
        return this.product.getPrice() * this.quantity;
    }

}
