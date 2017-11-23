package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Bishop extends ChessPiece {

	/**
	 * Constructor: no parameter/s
	 */
	public Bishop() {

		super(3);

	}

	/**
	 * Method that describes the movement of a bishop
	 */
	@Override
	public void move() {

		System.out.println("diagonally");

	}

	@Override
	public String toString() {
		return "Bishop [getValue()= " + getValue() + "]";
	}

}
