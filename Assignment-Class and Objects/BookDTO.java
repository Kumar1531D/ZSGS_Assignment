package classAndObjects;

public class BookDTO {
	private String title;
	private String ISBN;
    private String author;
    private double price;
    private int publishedYear;
    
    private static int totalBookCount = 0;
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public int getTotalCountOfBooks() {
		return totalBookCount;
	}
	
	public String getDetails() {
        return "Title: " + title +
               "\nISBN: " + ISBN +
               "\nAuthor: " + author +
               "\nPrice: $" + price +
               "\nPublished Year: " + publishedYear;
    }
}
