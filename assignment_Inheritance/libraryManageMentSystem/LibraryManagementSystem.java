package assignment_Inheritance.libraryManageMentSystem;

import java.util.ArrayList;
import java.util.List;

import university.students.Student;

public class LibraryManagementSystem {
	private String userType;
	private String userName;
	private String password;

	private List<User> users;
	private List<Book> books;
	private Librarian librarian;
	private LibraryDatabase libraryDatabase;

	public LibraryManagementSystem(Librarian librarian, List<User> users, List<Book> books, LibraryDatabase libraryDatabase) {
	        this.librarian = librarian;
	        this.users = users != null ? users : new ArrayList<>(); 
	        this.books = books != null ? books : new ArrayList<>();
	        this.libraryDatabase = libraryDatabase != null ? libraryDatabase : new LibraryDatabase(this.books);
	    }

	public String login() {
		return "Login successful";
	}

	public String register() {
		return "Registration successful";
	}

	public String logout() {
		return "Logout successful";
	}

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();
		User staff = new Staff("staff1", 97, "CSE");
		User student = new Students("Kumar",15,"BE.CSE");
		users.add(student);
		users.add(staff);

		List<Book> books = new ArrayList<>();
		Book book1 = new Book("HarryPotter", "J.K.Rowling", "123456789", "2001");
		Book book2 = new Book("JAVA", "Hebert schildt", "987654321", "2023");
		books.add(book1);
		books.add(book2);

		LibraryDatabase libraryDatabase = new LibraryDatabase(books);
		Librarian librarian = new Librarian("Muthu", 123, "123", libraryDatabase);

		LibraryManagementSystem lms = new LibraryManagementSystem(librarian, users, books, libraryDatabase);

		lms.register();
		lms.login();

		for (Book book : lms.books) {
			System.out.println(book.getTitle());
		}

		lms.logout();
	}
}
