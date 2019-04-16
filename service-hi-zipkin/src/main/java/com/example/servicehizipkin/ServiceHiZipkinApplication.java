package com.example.servicehizipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHiZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiZipkinApplication.class, args);
	}

}
