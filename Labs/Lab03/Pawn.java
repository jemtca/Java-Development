package ca.ciccc.java.model;

public class Pawn extends ChessPiece {

	private boolean hasBeenPromoted;
	ChessPiece newPiece;

	public Pawn() {

		super(1);

	}

	public boolean getHasBeenPromoted() {

		return this.hasBeenPromoted;

	}

	public final void setHasBeenPromoted(boolean hasBeenPromoted) {

		this.hasBeenPromoted = hasBeenPromoted;

	}

	public ChessPiece getChessPiece() {

		return this.newPiece;

	}

	public void promote(ChessPiece newPiece) {

		// a pawn can not be a pawn or a king
		if (getHasBeenPromoted() || newPiece.getValue() == 1 || newPiece.getValue() == 1000) {
			System.out.println("Can not be promoted.");
		}
		// a pawn can be a knight, a bishop, a rook or a queen
		else {
			setHasBeenPromoted(true);
			// change the value
			System.out.println("Promoted.");
		}

	}

	@Override
	public void move() {

		System.out.println("forward 1");

	}

	@Override
	public String toString() {
		return "Pawn [getValue()= " + getValue() + "]";
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = super.hashCode();

		result = prime * result + (hasBeenPromoted ? 1231 : 1237);
		result = prime * result + ((newPiece == null) ? 0 : newPiece.hashCode());

		return result;

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (!super.equals(obj)) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Pawn other = (Pawn) obj;
		if (hasBeenPromoted != other.hasBeenPromoted) {
			return false;
		}

		if (newPiece == null) {
			if (other.newPiece != null) {
				return false;
			}
		} else if (!newPiece.equals(other.newPiece)) {
			return false;
		}

		return true;

	}

}
