package com.bjsxt.springcloudordersprovider.service;

import com.bjsxt.springcloudordersprovider.pojo.Orders;

import java.util.List;

public interface OrderService {
    /**
     * 根据id查询订单信息
     * @param id
     * @return
     */
    public Orders selectOne(Integer id);

    /**
     * 查询所有的订单信息
     * @return
     */
    public List<Orders> selectAll();

    /**
     * 添加订单
     */
    public Orders saveOrders(Orders orders);

}
