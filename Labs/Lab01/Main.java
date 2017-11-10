package controller;

import model.Model;

/**
 * Driver class
 * 
 * @author Jesús
 *
 */
public class Main {

	public static void main(String[] args) {

//		Model o1 = new Model("Susan", "Smith", 70, 120, false, true);
//		Model o2 = new Model("Tiger", "Woods", 72, 190, true, false);
		Model o3 = new Model("Constructor","With two parameters",84,280);

//		o1.printDetails();
//		o2.printDetails();
//
//		o1.displayModelDetails();
//		o2.displayModelDetails();
//		
//		o1.displayModelDetails(true);
//		o2.displayModelDetails(false);
//		
//		o2.displayModelDetails(true);
//		o1.displayModelDetails(false);
		
		System.out.println("[ORIGINAL OBJECT]\n");
		System.out.println("[USING printDetails METHOD]");
		o3.printDetails();
		System.out.println("[USING displayModelDetails METHOD]");
		o3.displayModelDetails();
		System.out.println("[USING displayModelDetails(true) METHOD]");
		o3.displayModelDetails(true);
		System.out.println("[USING displayModelDetails(false) METHOD]");
		o3.displayModelDetails(false);

		System.out.println("[CHANGING THE ORIGINAL OBJECT]\n");
		System.out.println("[SETTING NEW HEIGHT]");
		o3.setHeight(2, 0);
		o3.displayModelDetails();

		System.out.println("[SETTING NEW WEIGHT]");
		o3.setWeight(37);
		o3.displayModelDetails(false);

	}

}
