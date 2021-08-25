package com.dipudan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication @Controller
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {

		System.out.println("Application Class executed.");
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(Application.class);
	}

	@GetMapping("/*")
	@ResponseBody
	public String currentUserName() {
		return "Hello, Dipu Krishnan " ;
	}

}
