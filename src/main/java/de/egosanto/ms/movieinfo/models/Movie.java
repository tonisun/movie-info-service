package de.egosanto.ms.movieinfo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;

	@Column(name = "title")
	private String title;

	public Movie() {
	}
	
	public Movie(Long movieId, String title) {
		this.movieId = movieId;
		this.title = title;
	}

	/**
	 * @return the movieId
	 */
	public Long getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the name
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the name to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + "]";
	}
	
	
}
