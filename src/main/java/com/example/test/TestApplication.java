package com.example.test;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {
    @Bean
    public Function<String, String> test() {
        return s -> s.toUpperCase();
    }
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
