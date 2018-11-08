package com.demo.dubbo.orderweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class OrderWebApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(OrderWebApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}
}
