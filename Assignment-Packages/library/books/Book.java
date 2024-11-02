package library.books;

public class Book {
	private String title;
	private String ISBN;
    private String author;
    private double price;
    private int publishedYear;
    private boolean isAvailable;
    
    public Book(String title,String ISBN,String author,double price,int publishedYear){
    	this.title = title;
    	this.ISBN = ISBN;
    	this.author = author;
    	this.price = price;
    	this.publishedYear = publishedYear;
    	this.isAvailable = true;
    }
    
	public String getTitle() {
		return title;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getPublishedYear() {
		return publishedYear;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
    
	@Override
	public String toString() {
		return "\nTitle : "+title+
				"ISBN : "+ISBN+
				"Author : "+author+
				"Price : "+price+
				"Published year : "+publishedYear+
				"isAvailable : "+isAvailable;
	}
    
}
