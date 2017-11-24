package ca.ciccc.java.model;

/***
 * 
 * @author Jesús
 *
 */
public class Knight extends ChessPiece {

	/**
	 * Constructor: no parameter/s
	 */
	public Knight() {

		super(2);

	}

	/**
	 * Method that describes the movement of a knight
	 */
	@Override
	public void move() {

		System.out.println("like a L");

	}

	@Override
	public String toString() {
		return "Knight [getValue()= " + getValue() + "]";
	}

}
