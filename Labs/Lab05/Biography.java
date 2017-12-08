package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public final class Biography extends Book {

	/**
	 * private attribute for subject
	 */
	private Name subject;

	/**
	 * 
	 * Constructor: five parameters
	 * 
	 * @param firstName
	 *            (Name firstName)
	 * @param lastName
	 *            (Name lastName)
	 * @param title
	 *            (String title)
	 * @param yearPublished
	 *            (int yearPublished)
	 * @param subject
	 *            (Name subject)
	 * @throws InvalidArgumentException
	 *             if first name or last name is null or empty
	 * @throws InvalidBookDateException
	 *             if published year is greater than 2017
	 */
	public Biography(Name firstName, Name lastName, String title, int yearPublished, Name subject)
			throws InvalidArgumentException, InvalidBookDateException {

		super(firstName, lastName, title, yearPublished);
		setSubject(subject);
	}

	/**
	 * Subject accessor
	 * 
	 * @return subject value
	 */
	public final Name getSubject() {

		return this.subject;

	}

	/**
	 * Subject mutator
	 * 
	 * @param subject
	 *            (Name subject)
	 */
	public final void setSubject(Name subject) {

		if (subject != null) {

			this.subject = subject;

		}

	}

	@Override
	public String toString() {
		return "Biography: [firstName = " + getFirstName() + ", lastName = " + getLastName() + ", title = " + getTitle()
				+ ", yearPublished = " + getYearPublished() + ", subject = " + subject + "]";
	}

}
