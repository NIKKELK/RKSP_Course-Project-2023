package com.example.rschircoursework.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "discount")
@Setter
@Getter
@NoArgsConstructor
public class Discount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "discount_name")
    private String discountName;

    @Column(name = "sale_in_procent")
    private int sale;
}
