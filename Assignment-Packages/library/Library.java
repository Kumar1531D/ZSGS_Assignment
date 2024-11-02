package library;

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Library {

	public static void main(String[] args) {
		
		Book book = new Book("HarryPotter","498234","J.K.Rowling",2000.00,2001);
		Member member = new Member("Kumar","1531D");
		
		Transaction transaction = new Transaction(book,member);
		
		transaction.processTransaction(false);
		
		System.out.println(transaction.getDetails());
		
		System.out.println();
		
		transaction.processTransaction(true);
		System.out.println(transaction.getDetails());

	}

}
