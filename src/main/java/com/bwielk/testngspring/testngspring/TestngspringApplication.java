package com.bwielk.testngspring.testngspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bwielk.testngspring.testngspring.exampleservice"})
public class TestngspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestngspringApplication.class, args);
	}

}
