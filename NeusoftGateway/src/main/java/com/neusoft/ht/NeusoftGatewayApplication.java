package com.neusoft.ht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
public class NeusoftGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeusoftGatewayApplication.class, args);
	}

}
