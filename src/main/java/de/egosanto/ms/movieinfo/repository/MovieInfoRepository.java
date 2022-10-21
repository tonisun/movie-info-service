package de.egosanto.ms.movieinfo.repository;

import org.springframework.data.repository.CrudRepository;

import de.egosanto.ms.movieinfo.models.Movie;


public interface MovieInfoRepository extends CrudRepository<Movie, Long> {

}
