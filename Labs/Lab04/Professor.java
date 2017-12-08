package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Professor extends Employee implements Comparable<Professor> {

	/**
	 * Private attribute for teaching major
	 */
	private String teachingMajor;

	/**
	 * Constant: Overtime pay rate for professors
	 */
	public final double OVERTIME_PAY_RATE_FOR_PROFESSOR = 2.0;

	/**
	 * Constructor: two parameters
	 * 
	 * @param name (String name)
	 * @param teachingMajor (String teachingMajor)
	 */
	public Professor(String name, String teachingMajor) {

		super(name);
		setTeachingMajor(teachingMajor);

	}

	/**
	 * TeachingMajor accessor
	 * 
	 * @return teachingMajor
	 */
	public String getTeachingMajor() {

		return this.teachingMajor;

	}

	/**
	 * TeachingMajor mutator
	 * 
	 * @param teachingMajor (String teachingMajor)
	 */
	public final void setTeachingMajor(String teachingMajor) {

		this.teachingMajor = teachingMajor;

	}

	@Override
	public DressCode getDressCode() {

		return DressCode.FANCY;

	}

	@Override
	public boolean isPaidSalary() {

		return true;

	}

	@Override
	public boolean postSecondaryEducationRequired() {

		return true;

	}

	@Override
	public String getWorkVerb() {

		return "teach";

	}

	@Override
	public double getOverTimePayRate() {

		return OVERTIME_PAY_RATE_FOR_PROFESSOR;

	}

	@Override
	public String toString() {

		return "Professor: [" + getName() + ", teaches " + teachingMajor + "]";
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());

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
		if (!(obj instanceof Professor)) {

			return false;

		}
		Professor other = (Professor) obj;

		if (teachingMajor == null) {

			if (other.teachingMajor != null) {

				return false;

			}
		} else if (!teachingMajor.equals(other.teachingMajor)) {

			return false;

		}

		return true;
	}

	@Override
	public int compareTo(Professor p) {

		return this.teachingMajor.compareTo(p.teachingMajor);

	}

}
