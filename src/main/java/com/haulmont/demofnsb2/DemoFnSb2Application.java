package com.haulmont.demofnsb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

@SpringBootApplication
public class DemoFnSb2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoFnSb2Application.class, args);
	}

	@Bean
	Supplier<Integer> random() {
		return () -> ThreadLocalRandom.current().nextInt();
	}
}
