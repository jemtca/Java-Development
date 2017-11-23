package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Pawn extends ChessPiece {

	/**
	 * 
	 */
	private boolean hasBeenPromoted;

	/**
	 * 
	 */
	ChessPiece newPiece;

	/**
	 * 
	 */
	public Pawn() {

		super(1);

	}

	/**
	 * 
	 * @return
	 */
	public boolean getHasBeenPromoted() {

		return this.hasBeenPromoted;

	}

	/**
	 * 
	 * @param hasBeenPromoted
	 */
	public final void setHasBeenPromoted(boolean hasBeenPromoted) {

		this.hasBeenPromoted = hasBeenPromoted;

	}

	/**
	 * 
	 * @return
	 */
	public ChessPiece getChessPiece() {

		return this.newPiece;

	}

	/**
	 * 
	 * @param newPiece
	 */
	public void promote(ChessPiece newPiece) {

		// a pawn can not be a pawn or a king and can not be promoted twice
		if (newPiece.getValue() == 1) {
			System.out.println("Can not be promoted to a pawn.");
		} else if (newPiece.getValue() == 1000) {
			System.out.println("Can not be promoted to a king.");
		} else if (getHasBeenPromoted()) {
			System.out.println("Promoted already.");
		}
		// a pawn can be a knight, a bishop, a rook or a queen
		else {
			setHasBeenPromoted(true);
			this.newPiece = newPiece;
			System.out.println("Promoted.");
		}

	}

	/**
	 * 
	 */
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

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null) { // !super.equals(obj)
			return false;
		}

		if (!(obj instanceof ChessPiece)) { // getClass() != obj.getClass()
			return false;
		}

		Pawn other = (Pawn) obj;
		if (this.hasBeenPromoted != other.hasBeenPromoted) {
			return false;
		}

		if (this.newPiece == null) {
			if (other.newPiece != null) {
				return false;
			}
		} else if (!this.newPiece.equals(other.newPiece)) {
			return false;
		}

		return true;

	}

}
