package com.example.rschircoursework.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "phone_brand")
@Setter
@Getter
@NoArgsConstructor
public class PhoneBrand {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_brand_name")
    private String phoneBrandName;
}
