package com.lin.user.controller;


import com.lin.user.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/userTest")
    public String memTest() {
        String str = restTemplate.getForObject("http://order-server/orderTest", String.class);
        return str;
    }

    @RequestMapping("/userTest2")
    public String userTest2(){
        String str = orderFeign.orderTest2();
        return str;
    }


}
