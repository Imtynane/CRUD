package sn.ecpi.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "_product")
@Getter @Setter
public class Product {
    @Id @GeneratedValue
    private UUID id;
    @Column(nullable = false, name = "product_name",unique = true)
    private String productName;
    @Column(name = "price",nullable = false)
    private double productPrice;
}
