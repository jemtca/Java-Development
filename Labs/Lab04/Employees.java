package ca.ciccc.java.driver;

import ca.ciccc.java.model.Employee;
import ca.ciccc.java.model.HockeyPlayer;
import ca.ciccc.java.model.Professor;
import ca.ciccc.java.model.Parent;
import ca.ciccc.java.model.GasStationAttendant;

import java.util.ArrayList;

public class Employees {
	
	private ArrayList<Employee> al;
	
	public Employees() {
		
		al = new ArrayList<Employee>();
		
		al.add(new HockeyPlayer("Wayne Gretzky",894));
		al.add(new HockeyPlayer("Who Ever",0));
		al.add(new HockeyPlayer("Brent Gretzky",1));
		al.add(new HockeyPlayer("Pavel Bure",437));
		al.add(new HockeyPlayer("Jason Bourne",0));
		
		al.add(new Professor("Albert Einstein","Physics"));
		al.add(new Professor("Alan Turing","Computer Systems"));
		al.add(new Professor("Richard Feynman","Physics"));
		al.add(new Professor("Tim Berners-Lee","Computer Systems"));
		al.add(new Professor("Kurt Godel","Logic"));
		
		al.add(new Parent("Tiger Woods",1));
		al.add(new Parent("Super Mom",168));
		al.add(new Parent("Lazy Larry",20));
		al.add(new Parent("Ex Hausted",168));
		al.add(new Parent("Super Dad",167));
		
		al.add(new GasStationAttendant("Joe Smith", 10));
		al.add(new GasStationAttendant("Tony Baloney", 100));
		al.add(new GasStationAttendant("Benjamin Franklin", 100));
		al.add(new GasStationAttendant("Mary Fairy", 101));
		al.add(new GasStationAttendant("Bee See", 1));
		
	}
	
	public void displayDetails() {
		
		for(Employee e : al) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		Employees e = new Employees();
		
		e.displayDetails();
		
	}

}
