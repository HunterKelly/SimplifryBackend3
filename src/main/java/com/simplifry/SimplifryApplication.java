package com.simplifry;

import com.simplifry.configurations.CorsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimplifryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplifryApplication.class, args);
	}
	@Bean
	public CorsConfig corsConfig() {
		return new CorsConfig();
	}
}


