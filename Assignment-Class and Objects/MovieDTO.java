package classAndObjects;

public class MovieDTO {
	private String title;
	private String director;
	private String genre;
	private int releaseYear;
	private double duration;
	private double rating;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getDetails() {
		return "\nTitle : " +title+
				"\nDirector : "+director+
				"\nGenre : "+genre+
				"\nReleaseYear : "+releaseYear+
				"\nDuration : "+duration+" Hours"+
				"\nRating (Out of 5) : "+rating ;
	}
}
