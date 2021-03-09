package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProyectoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoMavenApplication.class, args);
		System.out.print("Hola Mundo");
	}

	@GetMapping ("/holamundo")
	public String hola() {
		return "Hola Mundo!";
	}
}
