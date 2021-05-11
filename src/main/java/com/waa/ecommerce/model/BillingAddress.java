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
public class BillingAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billingAddress_id;
    private String street;
    private String City;
    private String state;
    private String zipCode;
    @OneToOne
    private Order order;
//    @OneToOne(mappedBy = "billingAddress",cascade = CascadeType.ALL)
//    private Payment payment;


}
