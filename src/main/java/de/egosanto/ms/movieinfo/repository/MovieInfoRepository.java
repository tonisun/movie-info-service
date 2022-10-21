package de.egosanto.ms.movieinfo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.egosanto.ms.movieinfo.models.Movie;


public interface MovieInfoRepository extends CrudRepository<Movie, Long> {

}
