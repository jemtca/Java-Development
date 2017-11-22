package ca.ciccc.java.controller;

import ca.ciccc.java.model.ChessPiece;
import ca.ciccc.java.model.Pawn;
import ca.ciccc.java.model.Knight;
import ca.ciccc.java.model.Bishop;
import ca.ciccc.java.model.Rook;
import ca.ciccc.java.model.Queen;
import ca.ciccc.java.model.King;


public class Driver {
	
	public static void main(String[] args) {
		
		Pawn cp1 = new Pawn();
		Knight cp2 = new Knight();
		Bishop cp3 = new Bishop();
		Rook cp4 = new Rook();
		Queen cp5 = new Queen();
		King cp6 = new King();
		
		Pawn cp7 = new Pawn();
		Knight cp8 = new Knight();
		Bishop cp9 = new Bishop();
		Rook cp10 = new Rook();
		Queen cp11 = new Queen();
		King cp12 = new King();
		
		System.out.print("I am a Pawn and my move is: ");
		cp1.move();
		
		System.out.print("I am a Knight and my move is: ");
		cp2.move();
		
		System.out.print("I am a Bishop and my move is: ");
		cp3.move();
		
		System.out.print("I am a Rook and my move is: ");
		cp4.move();
		
		System.out.print("I am a Queen and my move is: ");
		cp5.move();
		
		System.out.print("I am a King and my move is: ");
		cp6.move();
		
		System.out.println();
		
		cp7.move();
		cp7.promote(cp8);
		cp7.move();
		cp7.promote(cp8);
	
	}

}
