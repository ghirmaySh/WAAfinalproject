package com.waa.ecommerce.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer payment_id;
    private String card_number;
    private String cardHolder_name;
    private LocalDate dateOfExpiry;
    private Integer cvc;
    @OneToOne
    private Order order;
    @OneToOne
    private BillingAddress billingAddress;
}
