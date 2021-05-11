package com.waa.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seller_id;
    private boolean isApproved;
    private  String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @ManyToMany(mappedBy = "followedSellers", cascade = CascadeType.ALL)
    private List<Buyer> followingBuyers;
}
