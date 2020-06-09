package com.webcore.app.easyemi.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EasyEmiEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyEmiEurekaApplication.class, args);
	}

}
