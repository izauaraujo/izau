package br.com.nextapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;

@SpringBootApplication
public class ApiwebApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ApiwebApplication.class, args);
	}
}
