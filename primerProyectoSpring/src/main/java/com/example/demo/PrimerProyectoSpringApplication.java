package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Lo podemos probar desde PostMan

@SpringBootApplication
@RestController
public class PrimerProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringApplication.class, args);
	}

	// http://localhost:8080/saluda
	@GetMapping("/saluda")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello Mundo");
	}

	// http://localhost:8080
	@GetMapping("/")
	public String wellcome() {
		return String.format("Bienvenido a Spring Framework");
	}

}
