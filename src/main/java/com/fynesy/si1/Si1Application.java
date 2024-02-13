package com.fynesy.si1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Si1Application {

	public static void main(String[] args) {
		SpringApplication.run(Si1Application.class, args);
	}

	@RequestMapping("/")
	public String index() {
		System.out.println("hello world");
		return "hello world\n";
	}

}
