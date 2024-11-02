package library.transactions;

import java.time.LocalDate;

import library.books.Book;
import library.members.Member;

public class Transaction {
	private Book book;
	private Member member;
	private LocalDate borrowdate;
	private LocalDate returnDate;
	
	public Transaction(Book book, Member member) {
		this.book = book;
		this.member = member;
		this.borrowdate = LocalDate.now();
		this.returnDate = null;
	}
	
	public void processTransaction(boolean isReturning) {
		
		if(isReturning) {
			this.returnDate = LocalDate.now();
			this.book.setAvailable(true);
			System.out.println(this.book.getTitle()+" is borrowed at "+this.borrowdate +" and returned at "+this.returnDate);
		}
		else {
			if(book.isAvailable()) {
				this.borrowdate = LocalDate.now();
				this.book.setAvailable(false);
				System.out.println("Book borrowed : "+this.book.getTitle());
			}
			else 
				System.out.println(this.book.getTitle()+" is not available for borrowing! ");
		}
		
	}
	
	public String getDetails() {
		return "\nBook Name : "+book.getTitle()+
				"\nMember Name : "+member.getName()+
				"\nBorrowed Date : "+borrowdate+
				"\nReturned Date : "+returnDate;
	}
	
	
}
