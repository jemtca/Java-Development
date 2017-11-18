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

}
