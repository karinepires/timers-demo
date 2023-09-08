package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(Long.parseLong(System.getenv("start"))).toMillis());
		SpringApplication.run(DemoApplication.class, args);
	}

}
