package com.woodhill.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * UserServiceApplication is the main class for the UserService Spring Boot application.
 *
 * @EnableDiscoveryClient annotation to enable service discovery for the application.
 * This allows the application to register itself with a service registry and to discover other services in the system.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceApplication {

	/**
	 * The main method starts the UserService Spring Boot application.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
