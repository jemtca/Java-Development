package ca.ciccc.java.model;

public class GasStationAttendant extends Employee {

	private double numberOfDollarsStolenPerDay;

	public final double OVERTIME_PAY_RATE_FOR_GASSTATIONATTENDANT = 1.5;

	
	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
		
		super(name);
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
		
	}
	
	public double getNumberOfDollarsStolenPerDay() {
		
		return this.numberOfDollarsStolenPerDay;
		
	}
	
	public final void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
		
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
		
	}

	@Override
	public DressCode getDressCode() {
		
		return DressCode.UNIFORM;
		
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
		
		return "pump";
		
	}

	@Override
	public double getOverTimePayRate() {

		return OVERTIME_PAY_RATE_FOR_GASSTATIONATTENDANT;

	}

	@Override
	public String toString() {
		
		return "GasStationAttendant: [" + getName() + ", steals " + numberOfDollarsStolenPerDay + "  dollar(s) a day]";
		
	}

}
