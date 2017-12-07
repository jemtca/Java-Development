package ca.ciccc.java.model;

/**
 * 
 * @author Jesus
 *
 */
public class Name {

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 * @param name
	 */
	public Name(String name) {

		setName(name);

	}

	/**
	 * 
	 * @return
	 */
	public final String getName() {

		return this.name;

	}

	/**
	 * 
	 * @param name
	 */
	public final void setName(String name) {

		if (name != null) {

			this.name = name;

		}

	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((name == null) ? 0 : name.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;

		}
		if (obj == null) {

			return false;

		}
		if (!(obj instanceof Name)) {

			return false;

		}

		Name other = (Name) obj;
		if (name == null) {

			if (other.name != null) {

				return false;

			}
		} else if (!name.equals(other.name)) {

			return false;

		}

		return true;

	}

	@Override
	public String toString() {

		// return "Name: [name=" + name + "]";
		return name;

	}

}
