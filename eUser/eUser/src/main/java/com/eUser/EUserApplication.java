package com.eUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EUserApplication.class, args);
		System.out.println("start...Port No : 8081 ");
	}

}
