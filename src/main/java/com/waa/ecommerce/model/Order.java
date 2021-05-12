package com.waa.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="User_Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate deliveryDate;
    @OneToOne
    private ShippingAddress shippingAddress;
    @OneToOne(cascade = CascadeType.ALL)
    private BillingAddress billingAddress;

    // Questioned
//    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
//    private List<CartItem> cartItemList;

    @OneToOne
 private ShoppingCart shoppingCart; //New
}
