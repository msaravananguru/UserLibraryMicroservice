package com.eApiGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EApiGateWayApplication.class, args);
		System.out.println("start... Port No : 8080 ");
	}

}
