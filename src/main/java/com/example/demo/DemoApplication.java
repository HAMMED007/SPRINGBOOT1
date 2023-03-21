package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RestController
	public class NameController {

		@PostMapping("/name")
		public Map<String, String> getName(@RequestBody Map<String, String> request) {
			String firstName = request.get("firstName").trim();
			String lastName = request.get("lastName").trim();


			String fullName = firstName + " " + lastName;



			Map<String, String> response = new HashMap<>();
			response.put("fullName", fullName);
			return response;
		}
	}
}

