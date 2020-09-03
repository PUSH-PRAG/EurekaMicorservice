package com.scb.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class ClientRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRegistryApplication.class, args);
	}

	@RequestMapping("/welcome/{name}")
	public String welcome(@PathVariable(value = "name") String name) {
		return "hi pushparaj";

	}

}
