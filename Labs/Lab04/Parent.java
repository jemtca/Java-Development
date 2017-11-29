package ca.ciccc.java.model;

public class Parent extends Employee {

	private int numberOfHoursSpentPerWeekWithKids;

	public final double OVERTIME_PAY_RATE_FOR_PARENT = -2.0;

	public Parent(String name) {
		super(name);
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

}
