package com.xavier.e_commerce.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private BigDecimal value;

    @Column(nullable = false)
    private int stock;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "registration_date", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime registrationDate;

    @Column(name = "update_date")
    @UpdateTimestamp
    private LocalDateTime update;

}
