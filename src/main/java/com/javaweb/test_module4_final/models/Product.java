package com.javaweb.test_module4_final.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

}
