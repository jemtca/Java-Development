package ca.ciccc.java.model;

public class Queen extends ChessPiece {
	
	public Queen() {
		
		super(9);
		
	}
	
	@Override
	public void move() {
		
		System.out.println("like a bishop or a rook");
		
	}

	@Override
	public String toString() {
		return "Queen [getValue()= " + getValue() + "]";
	}
	
}
