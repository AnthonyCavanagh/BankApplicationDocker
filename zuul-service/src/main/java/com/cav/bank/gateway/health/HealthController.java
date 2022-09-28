package com.cav.bank.gateway.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class HealthController {

	@GetMapping(value = "/health/")
	public String getHeath() {
		return "UP";
	}
}
