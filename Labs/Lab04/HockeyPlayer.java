package ca.ciccc.java.model;

public class HockeyPlayer extends Employee {

	private int numberOfGoals;

	public final double OVER_TIME_RATE_FOR_HOCKEYPLAYER = 0.0;

	
	public HockeyPlayer(String name, int numberOfGoals) {
		
		super(name);
		setNumberOfGoals(numberOfGoals);
		
	}
	
	public double getNumberOfGoals() {
		
		return this.numberOfGoals;
		
	}
	
	public final void setNumberOfGoals(int numberOfGoals) {
		
		this.numberOfGoals = numberOfGoals;
		
	}

	@Override
	public DressCode getDressCode() {
		
		return DressCode.JERSEY;
		
	}

	@Override
	public boolean isPaidSalary() {
		
		return true;
		
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		
		return false;
		
	}

	@Override
	public String getWorkVerb() {
		
		return "play";
		
	}

	@Override
	public double getOverTimePayRate() {

		return OVER_TIME_RATE_FOR_HOCKEYPLAYER;

	}

	@Override
	public String toString() {
		
		return "HockeyPlayer: [" + getName() + ", scored " + numberOfGoals + " goal(s)]";
		
	}

}
