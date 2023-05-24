package com.deval.springboot.core.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

	SpringcoredemoApplication(){
		super();
		System.out.println("Constructor : Inside Spring Core Demo Application");
	}

}
