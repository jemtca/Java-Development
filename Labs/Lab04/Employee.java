package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public abstract class Employee implements Employable {

	/**
	 * Private attribute for the name of each person
	 */
	private String name;

	/**
	 * Constructor: no parameters
	 * 
	 * @param name (String name)
	 */
	public Employee(String name) {

		setName(name);

	}

	/**
	 * Name accessor
	 * 
	 * @return name
	 */
	public String getName() {

		return this.name;

	}

	/**
	 * Name mutator
	 * 
	 * @param name (String name)
	 */
	public final void setName(String name) {

		if (name != null) {
			this.name = name;
		}

	}

	/**
	 * OverTimeRate accessor
	 * 
	 * @return people's OverTimePayRate
	 */
	public abstract double getOverTimePayRate();

}
