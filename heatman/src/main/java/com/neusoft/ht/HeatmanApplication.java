package com.neusoft.ht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HeatmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeatmanApplication.class, args);
	}

}
