package com.example.rschircoursework.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Setter
@Getter
@NoArgsConstructor
public class Item {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cost")
    private int cost;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="item_type_id", insertable = false, updatable = false)
    @JsonIgnore
    private ItemType itemType;

    @Column(name="item_type_id")
    private Long itemTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="phone_brand_id", insertable = false, updatable = false)
    @JsonIgnore
    private PhoneBrand phoneBrand;

    @Column(name="phone_brand_id")
    private Long phoneBrandId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="discount_id", insertable = false, updatable = false)
    @JsonIgnore
    private Discount discount;

    @Column(name="discount_id")
    private Long discountId;

    @Column(name = "image_item")
    private String imagePath;

    @Transient
    private double costWithSale;
}
