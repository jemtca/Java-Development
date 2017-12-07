package ca.ciccc.java.model;

/**
 * 
 * @author Jesus
 *
 */
public class Book {

	/**
	 * 
	 */
	private Name firstName;
	/**
	 * 
	 */
	private Name lastName;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private int yearPublished;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param title
	 * @param yearPublished
	 * @throws InvalidArgumentException
	 * @throws InvalidBookDateException
	 */
	public Book(Name firstName, Name lastName, String title, int yearPublished)
			throws InvalidArgumentException, InvalidBookDateException {

		setFirstName(firstName);
		setLastName(lastName);
		setTitle(title);
		setYearPublihed(yearPublished);

	}

	/**
	 * 
	 * @return
	 */
	public final Name getFirstName() {

		return firstName;

	}

	/**
	 * 
	 * @param firstName
	 * @throws InvalidArgumentException
	 */
	public final void setFirstName(Name firstName) throws InvalidArgumentException {

		if (firstName.getName() == null || firstName.getName().equals("")) { // null or empty string

			throw new InvalidArgumentException("Null or empty string for first name");

		}

		else {

			this.firstName = firstName;

		}

	}

	/**
	 * 
	 * @return
	 */
	public final Name getLastName() {

		return this.lastName;

	}

	/**
	 * 
	 * @param lastName
	 * @throws InvalidArgumentException
	 */
	public final void setLastName(Name lastName) throws InvalidArgumentException {

		if (lastName.getName() == null || lastName.getName().equals("")) { // null or empty string

			throw new InvalidArgumentException("Null or empty string for last name");

		} else {

			this.lastName = lastName;

		}

	}

	/**
	 * 
	 * @return
	 */
	public final String getTitle() {

		return this.title;

	}

	/**
	 * 
	 * @param title
	 * @throws InvalidArgumentException
	 */
	public final void setTitle(String title) throws InvalidArgumentException {

		if (title == null || title == "") { // null or empty string

			throw new InvalidArgumentException("Null or empty string for the title");

		} else {

			this.title = title;

		}

	}

	/**
	 * 
	 * @return
	 */
	public final int getYearPublished() {

		return this.yearPublished;

	}

	/**
	 * 
	 * @param yearPublished
	 * @throws InvalidBookDateException
	 */
	public final void setYearPublihed(int yearPublished) throws InvalidBookDateException {

		if (yearPublished > 2017) { // > 2017

			throw new InvalidBookDateException("Year published is greater than 2017");

		} else {

			this.yearPublished = yearPublished;

		}

	}

	@Override
	public String toString() {

		return "Book: [firstName= " + firstName + ", lastName= " + lastName + ", title= " + title + ", yearPublished= "
				+ yearPublished + "]";

	}

}
