package com.bjsxt.springcloudordersconsumer.controller;

import com.bjsxt.springcloudordersconsumer.feign.FeignOrderProvider;
import com.bjsxt.springcloudordersconsumer.pojo.Orders;
import com.bjsxt.springcloudordersconsumer.pojo.Test;
import com.bjsxt.springcloudordersconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private FeignOrderProvider feignOrderProvider;

    @GetMapping("/vips/{id}")
    public Orders loadOne(@PathVariable Integer id){
        return consumerService.selectOne(id);
    }

    @GetMapping("/vips")
    public List<Orders> loadAll(){
        return consumerService.selectAll();
    }

    @PostMapping("/vips")
    public Orders saveOrders(Orders orders){
        return consumerService.saveOrders(orders);
    }

    @PostMapping("/object")
    public String test1(Orders orders){
        System.out.println(orders.toString());
        return feignOrderProvider.test1(orders);
    }

}
