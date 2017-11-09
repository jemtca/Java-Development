package controller;

import model.Model;

public class Main {

	public static void main(String[] args) {

		Model o1 = new Model("Susan", "Smith", 70, 120, false, true);
		Model o2 = new Model("Tiger", "Woods", 72, 190, true, false);

		// o1.printDetails();
		// o2.printDetails();

		o1.displayModelDetails();
		// o2.displayModelDetails();
		//
		o1.displayModelDetails(true);
		// o2.displayModelDetails(true);

	}

}
