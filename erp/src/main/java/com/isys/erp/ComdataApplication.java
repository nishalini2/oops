package com.isys.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.isys.erp")

@SpringBootApplication
public class ComdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComdataApplication.class, args);
	}

}
