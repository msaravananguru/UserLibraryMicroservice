package com.eApiGateWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EapiGateWay {

	@GetMapping("/apiGateWay")
	public String api() {
		return "ApiGateWay";
	}
}
