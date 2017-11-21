package ca.ciccc.java.model;

public class Rook extends ChessPiece {
	
	public Rook() {

		super(5);
	
	}
	
	@Override
	public void move() {

		System.out.println("horizontally or vertically");
	
	}

	@Override
	public String toString() {
		return "Rook [getValue()= " + getValue() + "]";
	}

}
