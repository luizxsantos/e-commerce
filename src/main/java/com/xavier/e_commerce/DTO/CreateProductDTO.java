package com.xavier.e_commerce.DTO;

import com.xavier.e_commerce.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDTO {

    private String name;

    private String description;

    private BigDecimal value;

    private int stock;

    private Category category;


}
