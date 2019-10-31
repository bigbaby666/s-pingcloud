package com.bjsxt.springcloudordersconsumer.feign;

import com.bjsxt.springcloudordersconsumer.pojo.Orders;
import com.bjsxt.springcloudordersconsumer.pojo.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("orders-provider")
public interface FeignOrderProvider {
    @GetMapping("/orders/{id}")
    public Orders loadOrder(@PathVariable("id") Integer id);

    @GetMapping("/orders")
    public List<Orders> loadOrderAll();

    @PostMapping("/orders")
    public Orders saveOrder(@RequestBody Orders orders);

    @PostMapping("/object")
    public String test1(@RequestBody Orders orders);

}
