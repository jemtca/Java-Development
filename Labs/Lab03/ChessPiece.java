package ca.ciccc.java.model;

public abstract class ChessPiece {

	private int value;

	public ChessPiece(int value) {

		setValue(value);

	}

	public int getValue() {

		return this.value;

	}

	public final void setValue(int value) {

		this.value = value;

	}

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

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		ChessPiece other = (ChessPiece) obj;
		if (value != other.value)
			return false;

		return true;

	}

}