package ca.ciccc.java.driver;

import java.util.ArrayList;
import java.util.Iterator;

import ca.ciccc.java.model.Book;
import ca.ciccc.java.model.InvalidArgumentException;
import ca.ciccc.java.model.InvalidBookDateException;
import ca.ciccc.java.model.Name;

public class Bookstore {

	private ArrayList<Book> al;

	public Bookstore() {

		al = new ArrayList<Book>();

	}

	public void addBook(Name fn, Name ln, String title, int yearPublished) { // try / catch

		try {
		
			al.add(new Book(fn, ln, title, yearPublished));
		
		}
		
		catch(InvalidArgumentException invalidArgument){
			
			System.out.println("The exception message is: [" + invalidArgument.getMessage() + "]");
			
		}
		catch(InvalidBookDateException invalidBookDate){
			
			System.out.println("The exception message is: [" + invalidBookDate.getMessage() + "]");
			
		}

	}

	public void displayBooks() {

		Iterator<Book> it = al.iterator();

		while (it.hasNext()) {
			Book b = it.next();
			System.out.println(b);
		}

	}

	public static void main(String[] args) {

		Bookstore bs = new Bookstore();
		
		bs.addBook(new Name("Miguel"), new Name("de Cervantes"), "Don Quixote", 1605);
		bs.addBook(new Name("Charles"), new Name("Dickens"), "A Tale of Two Cities", 1859);
		bs.addBook(new Name("Antoine"), new Name("de Saint-Exupéry"), "The Little Prince", 1943);
		bs.addBook(new Name("Agatha"), new Name("Christie"), "And Then There Were None", 1939);
		bs.addBook(new Name("Lewis"), new Name("Carroll"), "Alice in Wonderland", 1865);
		
		bs.displayBooks();

	}

}
