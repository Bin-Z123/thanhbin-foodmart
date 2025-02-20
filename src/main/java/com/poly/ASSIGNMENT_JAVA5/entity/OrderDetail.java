package com.poly.ASSIGNMENT_JAVA5.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Table(name = "OrderDetails")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int quantity;
    BigDecimal price;
    BigDecimal total;
    String description;
    @ManyToOne
    @JoinColumn(name = "idorder")
    Order order;
    @ManyToOne
    @JoinColumn(name = "idproduct")
    Product product;
}
