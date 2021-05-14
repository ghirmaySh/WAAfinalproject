package com.waa.ecommerce.controller;


import com.waa.ecommerce.model.Order;
import com.waa.ecommerce.model.Payment;
import com.waa.ecommerce.model.ShippingAddress;
import com.waa.ecommerce.service.BuyerService;
import com.waa.ecommerce.service.OrderService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@CrossOrigin
@RestController
@RequestMapping("order")
public class OrderController {

//    @Autowired
//    BuyerService buyerService;
//
//    @Autowired
//    private OrderService orderService;
//
//
//
//    @GetMapping("/{id}")
//    public  Order getOrderById(@PathVariable long id){ //checked
//        Optional<Order> orderOptional = orderService.getOrderById(id);
//        if(orderOptional.isPresent()){
//            return modelMapper.map(orderOptional.get(), Order.class);
//        }
//        return null;
//    }
//
////    @PostMapping()
////    public Order createOrder(@RequestBody Order order) {    //checked
////       return orderService.createOrder(order);
////    }   //checked
//
//
//    @GetMapping("/{orderId}/cancel")
//    public @ResponseBody Boolean cancelOrder(@PathVariable long orderId){
//
//        return orderService.cancelOrder(orderId);
//    }
//
//    public String getOrderStatus(long orderId){
//
//        return orderService.getOrderStatus(orderId);
//    }
//
//    public List<OrderLine> getOrderLineById(long orderId){
//
//        return orderService.getOrderLineById(orderId);
//    }
////
////    @GetMapping
////    public List<Order> buyerOrder(){
////        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
////        UserDetailsImpl userdetails = (UserDetailsImpl) auth.getPrincipal();
////        Optional<Buyer> buyer =  buyerService.findAll().stream().
////                filter(x->x.getUser().getUsername().equalsIgnoreCase(userdetails.
////                        getUsername())).findFirst();
////        if(buyer.isPresent()){
////            List<Order> orders = orderService.getOrderForBuyer(buyer.get().getId());
////            return orders.stream()
////                    .map(p -> modelMapper.map(p, OrderDTO.class))
////                    .collect(Collectors.toList());
////        }
////        return null;
////    }
////
////
////        return null;
//
//    }
//
//    public void createOrder(Long cartId, ShippingAddress shipping, Payment payment){
//        orderService.createOrderFromCart(cartId,shipping,payment);
//    }
//
}