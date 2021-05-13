package com.waa.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Product {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String productName;
    //@Column(name="product_description")
    private String description;
    private String image;
    private boolean isSold;
    //    private Integer quantity;
    private float price;
   // @Enumerated(EnumType.ORDINAL)
   // @Column(name = "product_Catagory")
    private String category;

}
