package ca.ciccc.java.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import ca.ciccc.java.model.Book;
import ca.ciccc.java.model.Biography;
import ca.ciccc.java.model.InvalidArgumentException;
import ca.ciccc.java.model.InvalidBookDateException;
import ca.ciccc.java.model.Name;

/**
 * 
 * @author Jesús
 *
 */
public class Bookstore {

	/**
	 * private attribute to save books
	 */
	private ArrayList<Book> al;

	/**
	 * Constructor: no parameters
	 */
	public Bookstore() {

		al = new ArrayList<Book>();

	}

	/**
	 * 
	 * Method to add books (four parameters)
	 * 
	 * @param fn
	 *            (Name fn)
	 * @param ln
	 *            (Name ln)
	 * @param title
	 *            (String title)
	 * @param yearPublished
	 *            (int yearPublished)
	 */
	public void addBook(Name fn, Name ln, String title, int yearPublished) {

		try {

			al.add(new Book(fn, ln, title, yearPublished));

		}

		catch (InvalidArgumentException invalidArgument) {

			System.out.println("The exception message is: [" + invalidArgument.getMessage() + "]");

		} catch (InvalidBookDateException invalidBookDate) {

			System.out.println("The exception message is: [" + invalidBookDate.getMessage() + "]");

		}

	}

	/**
	 * 
	 * Method to add books with biography (five parameters)
	 * 
	 * @param fn
	 *            (Name fn)
	 * @param ln
	 *            (Name ln)
	 * @param title
	 *            (String title)
	 * @param yearPublished
	 *            (int publishedYear)
	 * @param subject
	 *            (Name subject)
	 */
	public void addBook(Name fn, Name ln, String title, int yearPublished, Name subject) {

		try {

			al.add(new Biography(fn, ln, title, yearPublished, subject));

		} catch (InvalidArgumentException invalidArgument) {

			System.out.println("The exception message is: [" + invalidArgument.getMessage() + "]");

		} catch (InvalidBookDateException invalidBook) {

			System.out.println("The exception message is: [" + invalidBook.getMessage() + "]\n");

		}

	}

	/**
	 * Method to display books saved in the array list
	 */
	public void displayBooksBeforeSort() {

		Iterator<Book> it = al.iterator();

		while (it.hasNext()) {
			Book b = it.next();
			System.out.println(b);
		}

	}

	/**
	 * Method to display sorted books saved in the array list
	 */
	public void displayBooksAfterSort() {

		Collections.sort(al);

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

		// adding a book with biography
		bs.addBook(new Name("Biography"), new Name("Instance"), "Biography Instance", 2017,
				new Name("Testing biography"));

		// exception with a empty name
		bs.addBook(new Name(""), new Name("Argument"), "Invalid Argument", 2017);

		// exception with a null last name
		bs.addBook(new Name("Invalid"), new Name(null), "Invalid Argument", 2017);

		// exception with a published year greater than 2017
		bs.addBook(new Name("Invalid"), new Name("Book"), "Invalid Book", 2018, new Name("Testing exception"));

		System.out.println("\n[ ARRAY LIST BEFORE SORT ]\n");
		bs.displayBooksBeforeSort();

		System.out.println("\n\n[ ARRAY LIST AFTER SORT ]\n");
		bs.displayBooksAfterSort();

		// Testing equal from Biography
		try {
			Biography b1 = new Biography(new Name("Biography"), new Name("Instance"), "Biography Instance", 2017,
					new Name("Testing biography"));

			Biography b2 = new Biography(new Name("Biography"), new Name("Instance"), "Biography Instance", 2017,
					new Name("Testing biography"));

			Biography b3 = new Biography(new Name("Biography"), new Name("Instance"), "Biography Instance", 2017,
					new Name("Testing biographi"));

			System.out.print("\n\n");
			System.out.println("Book 1 biography: [" + b1.getSubject() + "].");
			System.out.println("Book 2 biography: [" + b2.getSubject() + "].");
			System.out.println(
					"Two books with the same biography (true if equals, false otherwise): " + b1.equals(b2) + ".");

			System.out.println("\nBook 1 biography: [" + b1.getSubject() + "].");
			System.out.println("Book 3 biography: [" + b3.getSubject() + "].");
			System.out.println(
					"Two books with different biography (false if different, true otherwise): " + b1.equals(b3) + ".");

		} catch (InvalidArgumentException invalidArgument) {

			System.out.println("The exception message is: [" + invalidArgument.getMessage() + "]");

		} catch (InvalidBookDateException invalidBook) {

			System.out.println("The exception message is: [" + invalidBook.getMessage() + "]\n");

		}

	}

}
