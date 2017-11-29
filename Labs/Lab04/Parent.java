package ca.ciccc.java.model;

public class Parent extends Employee {

	private int numberOfHoursSpentPerWeekWithKids;

	public final double OVERTIME_PAY_RATE_FOR_PARENT = -2.0;

	
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
		
		super(name);
		setNNumberOfHoursSpentPerWeekWithKids(numberOfHoursSpentPerWeekWithKids);
		
	}
	
	public int getNumberOfHoursSpentPerWeekWithKids() {
		
		return this.numberOfHoursSpentPerWeekWithKids;
		
	}
	
	public final void setNNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
		
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
		
		return "Parent: [" + getName() + ", spends " + numberOfHoursSpentPerWeekWithKids + " hour(s)/week(s) with kids]";
	}

}
