package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public interface Employable {

	/**
	 * DressCode accessor
	 * 
	 * @return one of the four values from DressCode
	 */
	public DressCode getDressCode();
	
	/**
	 * IsPaidSalary accessor
	 * 
	 * @return true if it has salary or false otherwise
	 */
	public boolean isPaidSalary();

	/**
	 * postSecondaryEducationRequired accessor
	 * 
	 * @return true if necessary, false otherwise
	 */
	public boolean postSecondaryEducationRequired();

	/**
	 * getWorkVerb accessor
	 * 
	 * @return a string: "play", "teach", "care" or "pump"
	 */
	public String getWorkVerb();

}
