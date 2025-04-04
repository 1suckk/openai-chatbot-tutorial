package com.platform.interior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.platform.interior", "chat.controller", "chat.config"})
public class InteriorPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(InteriorPlatformApplication.class, args);
	}

}
