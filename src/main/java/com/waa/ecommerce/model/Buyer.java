package com.waa.ecommerce.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buyer_id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean reviewStatus;
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
    @ManyToMany
    private List<Seller> followedSellers;
    @OneToMany
    private List<Review>review;

}
