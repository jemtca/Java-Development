package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Queen extends ChessPiece {

	/**
	 * Constrcutor: no parameter/s
	 */
	public Queen() {

		super(9);

	}

	/**
	 * Method that describes the movement of a queen
	 */
	@Override
	public void move() {

		System.out.println("like a bishop or a rook");

	}

	@Override
	public String toString() {
		return "Queen [getValue()= " + getValue() + "]";
	}

}
