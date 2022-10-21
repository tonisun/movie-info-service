package de.egosanto.ms.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Movie Info Services
 * port:		8081
 * / 			get all movies
 * /getMovie    get movie by id
 * /addMovie
 * /updMovie
 * /delMovie
 *
 *
 * @author Toni Zeidler
 * s
 */
@SpringBootApplication
public class MovieInfoServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
