package com.poly.ASSIGNMENT_JAVA5.dto.request;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.poly.ASSIGNMENT_JAVA5.entity.Category;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductCreationRequest {
    String nameProduct;
    BigDecimal price;
    String image;
    boolean status = true;
    BigDecimal discount = new BigDecimal(0);
    int stockQuantity;
    int soldQuantity = 0;
    Date createAt;
    Category category;
}
