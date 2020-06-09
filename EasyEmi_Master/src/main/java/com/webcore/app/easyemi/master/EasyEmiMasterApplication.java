package com.webcore.app.easyemi.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class EasyEmiMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyEmiMasterApplication.class, args);
	}

}
