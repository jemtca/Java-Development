package ca.ciccc.java.model;

public class Pawn extends ChessPiece {
	
	public Pawn() {

		super(1);
	
	}
	
	@Override
	public void move() {
		
		System.out.println("forward 1");
		
	}

	@Override
	public String toString() {
		return "Pawn [getValue()= " + getValue() + "]";
	}
	
}
