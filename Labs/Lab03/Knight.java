package ca.ciccc.java.model;

public class Knight extends ChessPiece {
	
	public Knight() {
		
		super(2);
		
	}
	
	@Override
	public void move() {
		
		System.out.println("like a L");
		
	}

	@Override
	public String toString() {
		return "Knight [getValue()= " + getValue() + "]";
	}

}
