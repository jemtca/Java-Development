package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Book {

	/**
	 * private attribute for first name
	 */
	private Name firstName;
	/**
	 * private attribute for last name
	 */
	private Name lastName;
	/**
	 * private attribute for title
	 */
	private String title;
	/**
	 * private attribute for published year
	 */
	private int yearPublished;

	/**
	 * Constructor: four parameters
	 * 
	 * @param firstName
	 *            (Name firstName)
	 * @param lastName
	 *            (Name lastName)
	 * @param title
	 *            (String title)
	 * @param yearPublished
	 *            (int yearPublished)
	 * @throws InvalidArgumentException
	 *             if first name or last name is null or empty
	 * @throws InvalidBookDateException
	 *             if year published is greater than 2017
	 */
	public Book(Name firstName, Name lastName, String title, int yearPublished)
			throws InvalidArgumentException, InvalidBookDateException {

		setFirstName(firstName);
		setLastName(lastName);
		setTitle(title);
		setYearPublihed(yearPublished);

	}

	/**
	 * First name accessor
	 * 
	 * @return first name value
	 */
	public final Name getFirstName() {

		return firstName;

	}

	/**
	 * First name mutator
	 * 
	 * @param firstName
	 *            (Name firstName)
	 * @throws InvalidArgumentException
	 *             if first name is null or empty
	 */
	public final void setFirstName(Name firstName) throws InvalidArgumentException {

		if (firstName.getName() == null || firstName.getName().equals("")) {

			throw new InvalidArgumentException("Null or empty string for first name");

		}

		else {

			this.firstName = firstName;

		}

	}

	/**
	 * Last Name accessor
	 * 
	 * @return last name value
	 */
	public final Name getLastName() {

		return this.lastName;

	}

	/**
	 * Last name mutator
	 * 
	 * @param lastName
	 *            (Name lastName)
	 * @throws InvalidArgumentException
	 *             if last name is null or empty
	 */
	public final void setLastName(Name lastName) throws InvalidArgumentException {

		if (lastName.getName() == null || lastName.getName().equals("")) {

			throw new InvalidArgumentException("Null or empty string for last name");

		} else {

			this.lastName = lastName;

		}

	}

	/**
	 * Title accessor
	 * 
	 * @return title value
	 */
	public final String getTitle() {

		return this.title;

	}

	/**
	 * Title mutator
	 * 
	 * @param title
	 *            (String title)
	 * @throws InvalidArgumentException
	 *             if title is null or empty
	 */
	public final void setTitle(String title) throws InvalidArgumentException {

		if (title == null || title == "") {

			throw new InvalidArgumentException("Null or empty string for the title");

		} else {

			this.title = title;

		}

	}

	/**
	 * Year Published accessor
	 * 
	 * @return year published value
	 */
	public final int getYearPublished() {

		return this.yearPublished;

	}

	/**
	 * Year Published mutator
	 * 
	 * @param yearPublished
	 *            (int yearPublished)
	 * @throws InvalidBookDateException
	 *             if published year is greater than 2017
	 */
	public final void setYearPublihed(int yearPublished) throws InvalidBookDateException {

		if (yearPublished > 2017) {

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
