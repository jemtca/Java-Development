package ca.ciccc.java.driver;

import ca.ciccc.java.model.Employee;
import ca.ciccc.java.model.HockeyPlayer;
import ca.ciccc.java.model.Professor;
import ca.ciccc.java.model.Parent;
import ca.ciccc.java.model.GasStationAttendant;

import java.util.ArrayList;
import java.util.Collections;

public class Employees {

	private ArrayList<GasStationAttendant> gsa;
	private ArrayList<HockeyPlayer> hp;
	private ArrayList<Parent> pt;
	private ArrayList<Professor> pr;

	public Employees() {

		gsa = new ArrayList<GasStationAttendant>();
		hp = new ArrayList<HockeyPlayer>();
		pt = new ArrayList<Parent>();
		pr = new ArrayList<Professor>();

		hp.add(new HockeyPlayer("Wayne Gretzky", 894));
		hp.add(new HockeyPlayer("Who Ever", 0));
		hp.add(new HockeyPlayer("Brent Gretzky", 1));
		hp.add(new HockeyPlayer("Pavel Bure", 437));
		hp.add(new HockeyPlayer("Jason Bourne", 0));

		pr.add(new Professor("Albert Einstein", "Physics"));
		pr.add(new Professor("Alan Turing", "Computer Systems"));
		pr.add(new Professor("Richard Feynman", "Physics"));
		pr.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		pr.add(new Professor("Kurt Godel", "Logic"));

		pt.add(new Parent("Tiger Woods", 1));
		pt.add(new Parent("Super Mom", 168));
		pt.add(new Parent("Lazy Larry", 20));
		pt.add(new Parent("Ex Hausted", 168));
		pt.add(new Parent("Super Dad", 167));

		gsa.add(new GasStationAttendant("Joe Smith", 10));
		gsa.add(new GasStationAttendant("Tony Baloney", 100));
		gsa.add(new GasStationAttendant("Benjamin Franklin", 100));
		gsa.add(new GasStationAttendant("Mary Fairy", 101));
		gsa.add(new GasStationAttendant("Bee See", 1));

	}

	public void testingPolymorphism() {

		Employee gsa = new GasStationAttendant("GasStationAttendant", 14);
		Employee hp = new HockeyPlayer("HockeyPlayer", 23);
		Employee pt = new Parent("Parent", 55);
		Employee pr = new Professor("Professor", "88");

		System.out.println("[ POLYMORPHISM ]\n");

		System.out.println("GasStationAttendant: [" + gsa.getDressCode() + ", " + gsa.isPaidSalary() + ", "
				+ gsa.postSecondaryEducationRequired() + ", " + gsa.getWorkVerb() + "]");
		System.out.println("HockeyPlayer: [" + hp.getDressCode() + ", " + hp.isPaidSalary() + ", "
				+ hp.postSecondaryEducationRequired() + ", " + hp.getWorkVerb() + "]");
		System.out.println("Parent: [" + pt.getDressCode() + ", " + pt.isPaidSalary() + ", "
				+ pt.postSecondaryEducationRequired() + ", " + pt.getWorkVerb() + "]");
		System.out.println("Professor: [" + pr.getDressCode() + ", " + pr.isPaidSalary() + ", "
				+ pr.postSecondaryEducationRequired() + ", " + pr.getWorkVerb() + "]");

	}

	public void displayDetailsUsingForEachLoop() {

		System.out.println("\n[ ARRAY LIST BEFORE SORT ]\n");

		for (HockeyPlayer hpTemp : hp) {
			System.out.println(hpTemp);
		}

		System.out.println();

		for (Professor prTemp : pr) {
			System.out.println(prTemp);
		}

		System.out.println();

		for (Parent ptTemp : pt) {
			System.out.println(ptTemp);
		}

		System.out.println();

		for (GasStationAttendant gsaTemp : gsa) {
			System.out.println(gsaTemp);
		}

		Collections.sort(hp);
		Collections.sort(pr);
		Collections.sort(pt);
		Collections.sort(gsa);

		System.out.println();
		System.out.println("\n[ ARRAY LIST AFTER SORT ]\n");

		for (HockeyPlayer hpTemp : hp) {
			System.out.println(hpTemp);
		}

		System.out.println();

		for (Professor prTemp : pr) {
			System.out.println(prTemp);
		}

		System.out.println();

		for (Parent ptTemp : pt) {
			System.out.println(ptTemp);
		}

		System.out.println();

		for (GasStationAttendant gsaTemp : gsa) {
			System.out.println(gsaTemp);
		}

	}

	public static void main(String[] args) {

		Employees e = new Employees();

		e.testingPolymorphism();

		System.out.println();

		e.displayDetailsUsingForEachLoop();

	}

}
