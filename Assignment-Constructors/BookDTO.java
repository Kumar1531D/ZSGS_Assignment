package assignment_Constructors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookDTO {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List<Book> books = new ArrayList<>();
		Set<String> isbnSet = new HashSet<>();
		
		System.out.println("Enter the number of books you want to add : ");
		int n = in.nextInt();
		in.nextLine(); 
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the "+(i+1)+" book details");
			
			Book book = new Book();
			
			System.out.println("Enter the Title of the book ");
			String title = in.nextLine();
			book.setTitle(title);
			
			String isbn;
			
			while(true) {
				System.out.println("Enter the ISBN number : ");
				String temp = in.nextLine();
				if(isbnSet.contains(temp)) {
					System.out.println("ISBN already exist! Please enter unique ISBN : ");
				}
				else {
					isbn = temp;
					isbnSet.add(temp);
					book.setISBN(isbn);
					break;
				}
			}
			
			System.out.println("Enter the Author Name : ");
			book.setAuthor(in.nextLine());
			
			System.out.println("Enter the price of the book : ");
			book.setPrice(in.nextDouble());
			
			System.out.println("Enter the published year of the book : ");
			book.setPublishedYear(in.nextInt());
			in.nextLine();
			
			books.add(book);
			
		}
		
		
		if (books.isEmpty()) {
			System.out.println("No books were added.");
		} else {
			for(int i = 0; i < books.size(); i++) {
				System.out.println("Book " + (i + 1) + " Details:");
				System.out.println(books.get(i).getDetails());
				System.out.println();
			}
		}

	}

}

class Book{
	
	private String title;
	private String ISBN;
    private String author;
    private double price;
    private int publishedYear;
    
    private static int totalBookCount = 0;
    
    Book(){};
    
    Book(String title, String ISBN, String author, double price, int publishedYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.publishedYear = publishedYear;
        totalBookCount++;
    }
    
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


