package ca.ciccc.java.controller;

import ca.ciccc.java.model.Pawn;
import ca.ciccc.java.model.Knight;
import ca.ciccc.java.model.Bishop;
import ca.ciccc.java.model.Rook;
import ca.ciccc.java.model.Queen;
import ca.ciccc.java.model.King;

public class Driver {

	public static void main(String[] args) {

		Pawn cp1 = new Pawn();
		Pawn cp2 = new Pawn();
		Pawn cp3 = new Pawn();
		Pawn cp4 = new Pawn();
		Knight cp5 = new Knight();
		Bishop cp6 = new Bishop();
		Rook cp7 = new Rook();
		Queen cp8 = new Queen();
		King cp9 = new King();

		System.out.print("I am a Pawn and my move is: ");
		cp1.move();

		System.out.print("I am a Knight and my move is: ");
		cp5.move();

		System.out.print("I am a Bishop and my move is: ");
		cp6.move();

		System.out.print("I am a Rook and my move is: ");
		cp7.move();

		System.out.print("I am a Queen and my move is: ");
		cp8.move();

		System.out.print("I am a King and my move is: ");
		cp9.move();

		System.out.println("\n[ Promoting a pawn to a pawn ]");
		cp1.promote(cp2);

		System.out.println("\n[ Promoting a pawn to a king ]");
		cp2.promote(cp9);

		System.out.println("\n[ Promoting a pawn to a knight ]");
		cp1.promote(cp5);
		System.out.println("Attribute value from new Piece: " + cp1.getNewPiece().getValue());

		System.out.println("\n[ Promoting the same piece again ]");
		cp1.promote(cp5);

		System.out.println("\n[ Promoting another pawn to a knight ]");
		cp2.promote(cp5);
		System.out.println("Attribute value from new Piece: " + cp2.getNewPiece().getValue());

		System.out.println("\nChecking if two promoted pawns (cp1 and cp2) are the same: " + cp1.equals(cp2));

		System.out.println("\n[ Promoting a pawn to a bishop ]");
		cp3.promote(cp6);
		System.out.println("Attribute value from new Piece: " + cp3.getNewPiece().getValue());

		System.out.println("\n[ Promoting a pawn to a rook ]");
		cp4.promote(cp7);
		System.out.println("Attribute value from new Piece: " + cp4.getNewPiece().getValue());

		System.out.println("\nChecking if two promoted pawns (cp3 and cp4) are the same: " + cp3.equals(cp4));

	}

}
