package com.engine.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
public class EngineMonitoring {
	public static void main(String[] args) {
		SpringApplication.run(EngineMonitoring.class, args);
	}
}
