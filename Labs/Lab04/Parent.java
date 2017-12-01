package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Parent extends Employee implements Comparable<Parent> {

	/**
	 * Private attribute for the number of hours spent per week with kids
	 */
	private int numberOfHoursSpentPerWeekWithKids;

	/**
	 * Constant: Overtime pay rate for parents
	 */
	public final double OVERTIME_PAY_RATE_FOR_PARENT = -2.0;

	/**
	 * Cosntructor: two parameters
	 * 
	 * @param name (String name)
	 * @param numberOfHoursSpentPerWeekWithKids (int numberOfHoursSpentPerWeekWithKids)
	 */
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {

		super(name);
		setNumberOfHoursSpentPerWeekWithKids(numberOfHoursSpentPerWeekWithKids);

	}

	/**
	 * NumberOfHoursSpentPerWeekWithKids accessor
	 * 
	 * @return numberOfHoursSpentPerWeekWithKids
	 */
	public int getNumberOfHoursSpentPerWeekWithKids() {

		return this.numberOfHoursSpentPerWeekWithKids;

	}

	/**
	 * NumberOfHoursSpentPerWeekWithKids mutator
	 * 
	 * @param numberOfHoursSpentPerWeekWithKids ()
	 */
	public final void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {

		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;

	}

	@Override
	public DressCode getDressCode() {

		return DressCode.ANYTHING;

	}

	@Override
	public boolean isPaidSalary() {

		return false;

	}

	@Override
	public boolean postSecondaryEducationRequired() {

		return false;

	}

	@Override
	public String getWorkVerb() {

		return "care";

	}

	@Override
	public double getOverTimePayRate() {

		return OVERTIME_PAY_RATE_FOR_PARENT;

	}

	@Override
	public String toString() {

		return "Parent: [" + getName() + ", spends " + numberOfHoursSpentPerWeekWithKids
				+ " hour(s)/week(s) with kids]";
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + numberOfHoursSpentPerWeekWithKids;

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
		if (!(obj instanceof Parent)) {

			return false;

		}
		Parent other = (Parent) obj;

		if (numberOfHoursSpentPerWeekWithKids != other.numberOfHoursSpentPerWeekWithKids) {

			return false;

		}

		return true;
	}

	@Override
	public int compareTo(Parent p) {

		int result;

		if (this.numberOfHoursSpentPerWeekWithKids > p.numberOfHoursSpentPerWeekWithKids) {

			result = -1;

		} else if (this.numberOfHoursSpentPerWeekWithKids < p.numberOfHoursSpentPerWeekWithKids) {

			result = 1;

		} else {

			result = 0;

		}

		return result;

	}

}
