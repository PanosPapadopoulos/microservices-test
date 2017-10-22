package cs.unipi.gr.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Panagiotis Papadopoulos P10095
 * @University University of Pireus Cs Department
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class AuthenticationApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "authentication-config");
		SpringApplication.run(AuthenticationApplication.class, args);
	}
}
