package com.neusoft.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HeatmanConfigSreverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeatmanConfigSreverApplication.class, args);
                System.out.println("小小的测试");
	}

}
