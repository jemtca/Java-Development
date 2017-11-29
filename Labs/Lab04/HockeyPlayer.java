package ca.ciccc.java.model;

public class HockeyPlayer extends Employee {

	private int numberOfGoals;

	public final double OVER_TIME_RATE_FOR_HOCKEYPLAYER = 0.0;

	public HockeyPlayer(String name) {
		super(name);
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

}
