package cs.unipi.gr.applicationportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Panagiotis Papadopoulos P10095
 * @University University of Pireus Cs Department
 */

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPortalApplication.class, args);
	}
}
