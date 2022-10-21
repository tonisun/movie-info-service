package de.egosanto.ms.movieinfo.repository;

import org.springframework.data.repository.CrudRepository;

import de.egosanto.ms.movieinfo.models.Movie;

/**
 * CRUD Services Inteface for Movie Domain
 *
 * @author Toni Zeidler
 * s
 */
public interface MovieInfoRepository extends CrudRepository<Movie, Long> {

}
