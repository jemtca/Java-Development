package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class King extends ChessPiece {

	/**
	 * 
	 */
	public King() {

		super(1000);

	}

	/**
	 * 
	 */
	@Override
	public void move() {

		System.out.println("one square");

	}

	@Override
	public String toString() {
		return "King [getValue()= " + getValue() + "]";
	}

}
