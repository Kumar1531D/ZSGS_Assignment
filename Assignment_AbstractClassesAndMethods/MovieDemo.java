package assignment_AbstractClassesAndMethods;


public class MovieDemo {

	public static void main(String[] args) {
		Movie adventureMovie = new AdventureMovie("Chris Columbus","Harry Potter",10.0,1000,"Fantasy Adventure");
		Movie thrillerMovie = new ThrillerMovie("David Fincher","Seven",9.5,100,"Psycho Thriller");
		
		adventureMovie.getMovieDetails();
		System.out.println();
		thrillerMovie.getMovieDetails();

	}

}


abstract class Movie{
	private String directorName;
	private String movieName;
	private double rating;
	private double budget;
	
	Movie(String directorName,String movieName,double rating,double budget){
		this.directorName = directorName;
		this.movieName = movieName;
		this.rating = rating;
		this.budget = budget;
	}
	
	abstract String getGenre();
	abstract String getElement();
	
	public void getMovieDetails() {
		System.out.println("Director Name : "+directorName +"\nMovie Name : "+movieName+"\nRating (out of 10) : "+rating+
				"\nBudget : "+budget+" crores"+
				"\nGenre : "+getGenre()+"\nElement : "+getElement());
	}
}

class AdventureMovie extends Movie{
	String element;

	AdventureMovie(String directorName, String movieName, double rating, double budget,String element) {
		super(directorName, movieName, rating, budget);
		this.element = element;
	}

	@Override
	String getGenre() {
		return "Adventure";
	}

	@Override
	String getElement() {
		return element;
	}
	
}

class ThrillerMovie extends Movie{
	String element;

	ThrillerMovie(String directorName, String movieName, double rating, double budget,String element) {
		super(directorName, movieName, rating, budget);
		this.element = element;
	}

	@Override
	String getGenre() {
		return "Thriller";
	}

	@Override
	String getElement() {
		return element;
	}
	
}
