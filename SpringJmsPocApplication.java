package com.jms.poc.springjmspoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringJmsPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsPocApplication.class, args);
	}
}
