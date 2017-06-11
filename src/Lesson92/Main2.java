package Lesson92;

import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy->copy.changeAvailability());
		System.out.println(book.isAvailable());
		}

}
