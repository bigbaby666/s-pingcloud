package com.bjsxt.springcloudordersprovider.controller;

import com.bjsxt.springcloudordersprovider.pojo.Orders;
import com.bjsxt.springcloudordersprovider.pojo.Test;
import com.bjsxt.springcloudordersprovider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/{id}")
    public Orders loadOrder(@PathVariable("id") Integer id){
        return orderService.selectOne(id);
    }

    @GetMapping("/orders")
    public List<Orders> loadOrderAll(){
        return orderService.selectAll();
    }

    @PostMapping("/orders")
    public Orders saveOrder(@RequestBody Orders orders){
        return orderService.saveOrders(orders);
    }

    @PostMapping("/object")
    public String test1(@RequestBody Orders orders){
        System.out.println(orders.toString());
        return orders.toString() ;
    }

}
