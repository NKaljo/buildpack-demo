package dev.nkaljo.buildpack_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuildpackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildpackDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello buildpacks";
	}
}
