package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class King extends ChessPiece {

	/**
	 * Constructor: no parameter/s
	 */
	public King() {

		super(1000);

	}

	/**
	 * Method that describes the movement of a king
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
