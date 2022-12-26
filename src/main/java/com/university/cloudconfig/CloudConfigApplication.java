package com.university.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@RestController
public class CloudConfigApplication {
	
	@GetMapping("/message")
	public String welcome() {
		return "Cloud config starts ";
	}
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
