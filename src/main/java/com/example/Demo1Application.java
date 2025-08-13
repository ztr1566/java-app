package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration;


@Configuration
@SpringBootApplication(exclude = { SystemMetricsAutoConfiguration.class })
@EnableAutoConfiguration
@ComponentScan({"com.example.controller","com.example.service"})
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		// testing webhook
		// testing email notification
	}

}

