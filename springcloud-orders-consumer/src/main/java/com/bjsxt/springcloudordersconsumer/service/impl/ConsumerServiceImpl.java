package com.bjsxt.springcloudordersconsumer.service.impl;

import com.bjsxt.springcloudordersconsumer.feign.FeignOrderProvider;
import com.bjsxt.springcloudordersconsumer.pojo.Orders;
import com.bjsxt.springcloudordersconsumer.service.ConsumerService;
import com.bjsxt.springcloudordersconsumer.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.config.LoadBalancerCacheAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private FeignOrderProvider feignOrderProvider;

   /* @Autowired
    private RestTemplate restTemplate;
*/
    /**
     * eureka ：注册中心
     * 负载均衡器对象，ribbon组件实现负载均衡
     */
   /* @Autowired
    private LoadBalancerClient loadBalancerClient;*/

    @Override
    public Orders selectOne(Integer id) {

       /* ServiceInstance si = loadBalancerClient.choose("orders-provider");
        String host = si.getHost();
        int port = si.getPort();
        String url = "http://"+host+":"+port+"/orders/"+id;*/

      /* String *url = "http://orders-provider/orders/"+id;
        Orders orders = restTemplate.getForObject(url, Orders.class);
        return orders;*/

      return feignOrderProvider.loadOrder(id);
    }

    @Override
    public List<Orders> selectAll() {

     /*   ServiceInstance si = loadBalancerClient.choose("orders-provider");
        String host = si.getHost();
        int port = si.getPort();
        String url = "http://"+host+":"+port+"/orders";*/

       /* String url = "http://orders-provider/orders";
        Orders[] orders = restTemplate.getForObject(url, Orders[].class);
        return Arrays.asList(orders);*/
       return feignOrderProvider.loadOrderAll();
    }

    @Override
    public Orders saveOrders(Orders orders) {

      /*  LinkedMultiValueMap <String,String> header = new LinkedMultiValueMap<>();
        header.add("Content-Type","application/json;charset=UTF-8");

        String body = JsonUtils.objectToJson(orders);
        HttpEntity<String> request = new HttpEntity<>(body,header);
        String url = "http://orders-provider/orders";
        return restTemplate.postForObject(url,request,Orders.class);*/
      return feignOrderProvider.saveOrder(orders);
    }
}
