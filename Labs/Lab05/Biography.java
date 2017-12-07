package ca.ciccc.java.model;

/**
 * 
 * @author Jesus
 *
 */
public final class Biography extends Book {

	/**
	 * 
	 */
	private Name subject;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param title
	 * @param yearPublished
	 * @param subject
	 * @throws InvalidArgumentException
	 * @throws InvalidBookDateException
	 */
	public Biography(Name firstName, Name lastName, String title, int yearPublished, Name subject)
			throws InvalidArgumentException, InvalidBookDateException {

		super(firstName, lastName, title, yearPublished);
		setSubject(subject);
	}

	/**
	 * 
	 * @return
	 */
	public final Name getSubject() {

		return this.subject;

	}

	/**
	 * 
	 * @param subject
	 */
	public final void setSubject(Name subject) {

		if (subject != null) {

			this.subject = subject;

		}

	}

	@Override
	public String toString() {
		return "Biography [firstName = " + getFirstName() + ", lastName = " + getLastName() + ", title = " + getTitle()
				+ ", yearPublished = " + getYearPublished() + ", subject = " + subject + "]";
	}

}
