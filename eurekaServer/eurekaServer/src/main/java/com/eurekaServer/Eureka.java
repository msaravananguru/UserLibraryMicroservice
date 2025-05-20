package com.eurekaServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka")
public class Eureka {

	@GetMapping("eurekaGateWay")
	public String api() {
		return "eureka";
	}
}