package com.apiGatewaycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@EnableEurekaClient
//@EnableHystrix
public class ApiGatewayCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayCloudApplication.class, args);
	}

}