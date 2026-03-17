package com.data_jpa.learn_hibernate.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table
        (
                name = "Product_table",
                uniqueConstraints = {
                        @UniqueConstraint(name = "sku_unique",columnNames = "sku"),
                        @UniqueConstraint(name = "title_price_unique", columnNames = {"product_title","price"})
                },
                indexes = {
                        @Index(name = "sku_index", columnList = "sku")

                }
        )
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, length = 20)
    String sku;
    @Column(name = "product_title")
    String title;
    Double price;
    Integer quantity;
    @CreationTimestamp
    LocalDate createdAt;
    @UpdateTimestamp
    LocalDate updatedAt;

}
