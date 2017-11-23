package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Rook extends ChessPiece {

	/**
	 * Constructor: no parameter/s
	 */
	public Rook() {

		super(5);

	}

	/**
	 * Method that describes the movement of a rook
	 */
	@Override
	public void move() {

		System.out.println("horizontally or vertically");

	}

	@Override
	public String toString() {
		return "Rook [getValue()= " + getValue() + "]";
	}

}
