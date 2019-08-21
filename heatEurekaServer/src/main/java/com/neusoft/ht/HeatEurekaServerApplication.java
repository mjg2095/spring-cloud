package com.neusoft.ht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HeatEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeatEurekaServerApplication.class, args);
	}

}
