package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public abstract class ChessPiece {

	/**
	 * Private attribute for the value of the pieces in Chess
	 */
	private int value;

	/**
	 * Constructor: one parameter
	 * 
	 * @param value
	 *            (int value)
	 */
	public ChessPiece(int value) {

		setValue(value);

	}

	/**
	 * Value accessor
	 * 
	 * @return value
	 */
	public int getValue() {

		return this.value;

	}

	/**
	 * Value mutator
	 * 
	 * @param value
	 *            (int value)
	 */
	public final void setValue(int value) {

		if (value == 1 || value == 2 || value == 3 || value == 5 || value == 9 || value == 1000) {
			this.value = value;
		}

	}

	/**
	 * Abstract method to describe the movement of the pieces in Chess (implement it
	 * in each class)
	 */
	public abstract void move();

	@Override
	public String toString() {
		return "ChessPiece [value= " + value + "]";
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + value;

		return result;

	}

	/**
	 * Method to check if two chess pieces are the same or different ones
	 * 
	 * @return true if equals, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof ChessPiece)) { // getClass() != obj.getClass()
			return false;
		}

		ChessPiece other = (ChessPiece) obj;
		if (this.value != other.value) {
			return false;
		}

		return true;

	}

}
