package ca.ciccc.java.model;

public class Book {

	private Name firstName;
	private Name lastName;
	private String title;
	private int yearPublished;

	public Book(Name firstName, Name lastName, String title, int yearPublished) {

		setFirstName(firstName);
		setLastName(lastName);
		setTitle(title);
		setYearPublihed(yearPublished);

	}

	public final Name getFirstName() {

		return firstName;

	}

	public final void setFirstName(Name firstName) {

		if (firstName != null) {

			this.firstName = firstName;

		}

	}

	public final Name getLastName() {

		return this.lastName;

	}

	public final void setLastName(Name lastName) {

		if (lastName != null) {

			this.lastName = lastName;

		}

	}

	public final String getTitle() {

		return this.title;

	}

	public final void setTitle(String title) {

		if (title != null) {

			this.title = title;

		}

	}

	public final int getYearPublished() {

		return this.yearPublished;

	}

	public final void setYearPublihed(int yearPublished) {

		this.yearPublished = yearPublished;

	}

	@Override
	public String toString() {

		return "Book: [firstName= " + firstName + ", lastName= " + lastName + ", title= " + title + ", yearPublished= "
				+ yearPublished + "]";

	}

}
