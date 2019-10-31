package com.bjsxt.springcloudordersconsumer.service;

import com.bjsxt.springcloudordersconsumer.pojo.Orders;

import java.util.List;

public interface ConsumerService {

    /**
     * 根据订单id查询订单信息
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
     * 添加订单信息 ， 会员下订单
     * @param orders
     * @return
     */
    public Orders saveOrders(Orders orders);

}
