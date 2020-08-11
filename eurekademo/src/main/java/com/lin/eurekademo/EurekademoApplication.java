package com.lin.eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


//https://blog.csdn.net/weixin_44448094/article/details/88535475
@SpringBootApplication
@EnableEurekaServer
public class EurekademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekademoApplication.class, args);
	}

}
