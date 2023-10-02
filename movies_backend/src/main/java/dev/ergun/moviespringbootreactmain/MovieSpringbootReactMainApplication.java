package dev.ergun.moviespringbootreactmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieSpringbootReactMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieSpringbootReactMainApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Welcome to Movie API";
	}
}
