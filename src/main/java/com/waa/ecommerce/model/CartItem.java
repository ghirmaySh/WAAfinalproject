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
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private  Integer cartItem_id;
private Integer quantity;
@OneToOne
private Product product;
@ManyToOne
@JoinColumn(name="order_id")
private Order order;
// we need to check if the cascade type is all or not
@ManyToOne
private ShoppingCart shoppingCart;
}
