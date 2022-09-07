package com.bloomin.dsmeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class DsmetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsmetaApplication.class, args);
	}

}
