package com.bjsxt.springcloudordersprovider.service.impl;

import com.bjsxt.springcloudordersprovider.pojo.Orders;
import com.bjsxt.springcloudordersprovider.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Orders selectOne(Integer id) {
        Orders orders = new Orders();
        orders.setId(id);
        orders.setRemark("备注80");
        orders.setTotal(123.2);
        return orders;
    }

    @Override
    public List<Orders> selectAll() {
        List<Orders> list = new ArrayList<>();
        Orders orders = new Orders();
        orders.setId(111);
        orders.setRemark("备注80");
        orders.setTotal(123.2);
        Orders orders2 = new Orders();
        orders2.setId(222);
        orders2.setRemark("备注80");
        orders2.setTotal(222.2);
        list.add(orders);
        list.add(orders2);

        return list;
    }

    @Override
    public Orders saveOrders(Orders orders) {
        return orders;
    }
}
