package ca.ciccc.java.model;

public abstract class Employee implements Employable {

	private String name;

	public Employee(String name) {

		setName(name);

	}

	public String getName() {

		return this.name;

	}

	public final void setName(String name) {

		if (name != null) {
			this.name = name;
		}

	}

	public abstract double getOverTimePayRate();

}
