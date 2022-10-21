package de.egosanto.ms.movieinfo.repository;

import org.springframework.data.repository.CrudRepository;

import de.egosanto.ms.movieinfo.models.Movie;

/**
 * CRUD Services Inteface for Movie Domain
 * C = Create
 * R = Read oder Retrieve
 * U = Update
 * D = Delete oder Destroy
 * @see 'https://en.wikipedia.org/wiki/Create,_read,_update_and_delete'
 * @author Toni Zeidler
 *
 */
public interface MovieInfoRepository extends CrudRepository<Movie, Long> {

}
