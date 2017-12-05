package ca.ciccc.java.model;

public final class Biography extends Book {

	private Name subject;

	public Biography(Name firstName, Name lastName, String title, int yearPublished, Name subject) throws InvalidArgumentException, InvalidBookDateException{

		super(firstName, lastName, title, yearPublished);
		setSubject(subject);
	}

	public final Name getSubject() {

		return this.subject;

	}

	public final void setSubject(Name subject) {

		if (subject != null) {

			this.subject = subject;

		}

	}

}
