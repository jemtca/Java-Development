package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public enum DressCode {

	/**
	 * Different options for dress code
	 */
	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	/**
	 * Private attribute to describe the dress code
	 */
	private String description;

	/**
	 * Constructor: one parameter
	 * 
	 * @param s (String s)
	 */
	private DressCode(String s) {

		this.description = s;

	}

	/**
	 * Description accessor
	 * 
	 * @return description
	 */
	public String getDescription() {

		return description;

	}

}
