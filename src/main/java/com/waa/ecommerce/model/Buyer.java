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
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Digits(integer=6,fraction=0,message "this must be atleast {2}digits")
    private Integer buyer_id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean reviewStatus;
    private boolean sellItem;
    private Integer pointsGained;
    //using @Join column is not recommend
    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name="buyer_id")
    private List<ShippingAddress> shippingAddress;
    @OneToMany( cascade = CascadeType.ALL)
    private List<Order> orderList;
    @OneToMany( cascade = CascadeType.ALL)
    private List<Payment> paymentList;
    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL)
    private ShoppingCart shoppingCart;
   // @OneToOne
//    @Column(name="Buyer")
//    private Seller followedSellers;
    //not nessesary
    @OneToMany
    private List<Review>review;

}
