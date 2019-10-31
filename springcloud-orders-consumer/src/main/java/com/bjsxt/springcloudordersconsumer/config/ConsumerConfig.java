package com.bjsxt.springcloudordersconsumer.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 负载均衡策略
     */
//    @Bean
//    public RandomRule randomRule(){  // 随机    默认为轮询
//        return new RandomRule();
//    }

}
