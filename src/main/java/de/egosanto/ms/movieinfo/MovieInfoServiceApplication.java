package de.egosanto.ms.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Movie Info Services
 *
 * @author Toni Zeidler
 * s
 */
@SpringBootApplication
public class MovieInfoServiceApplication {

	// port 8081/movie
	public static void main(String[] args) {

		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
