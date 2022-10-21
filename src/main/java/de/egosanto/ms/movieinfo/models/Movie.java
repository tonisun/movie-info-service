package de.egosanto.ms.movieinfo.models;

@Entity
public class Movie {

	private Long movieId;
	
	private String name;

	public Movie() {
	}
	
	public Movie(Long movieId, String name) {
		this.movieId = movieId;
		this.name = name;
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
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + "]";
	}
	
	
}
