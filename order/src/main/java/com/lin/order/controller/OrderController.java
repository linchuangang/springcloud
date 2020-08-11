package com.lin.order.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("orderTest")
    public String orderTest() {
        return "this is order";
    }

    @RequestMapping("orderTest2")
    public String orderTest2() {
        return "this is order2";
    }

}

