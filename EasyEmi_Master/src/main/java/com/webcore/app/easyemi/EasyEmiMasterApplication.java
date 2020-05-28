package com.webcore.app.easyemi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@SpringBootApplication
public class EasyEmiMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyEmiMasterApplication.class, args);
	}

}
