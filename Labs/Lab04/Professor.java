package ca.ciccc.java.model;

public class Professor extends Employee {

	private String teachingMajor;

	public final double OVERTIME_PAY_RATE_FOR_PROFESSOR = 2.0;

	
	public Professor(String name, String teachingMajor) {
		
		super(name);
		setTeachingMajor(teachingMajor);
		
	}
	
	public String getTeachingMajor() {
		
		return this.teachingMajor;
		
	}
	
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
		
		return "Professor: ["+ getName() + ", teaches " + teachingMajor + "]";
	}

}
