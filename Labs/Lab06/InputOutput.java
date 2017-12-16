package ca.ciccc.java.view;

import ca.ciccc.java.model.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InputOutput {
	
	public InputOutput() {
		
		
		
	}
	
	public Date splitDate(String date) { //int[]
		
		String[] s;
		//int[] result = new int[3];
		Date d;
		
		s = date.split("-");
		
//		for(int i = 0; i < 3; i++) {
//			
//			result[i] = Integer.valueOf(s[i]);
//			//System.out.println(result[i]);
//			
//		}
		
		d = new Date(Integer.valueOf(s[2]),Integer.valueOf(s[1]),Integer.valueOf(s[0]));
		
		//System.out.println(Integer.valueOf(s[2]));
		//System.out.println(Integer.valueOf(s[1]));
		//System.out.println(Integer.valueOf(s[0]));
		//System.out.println(d);
		
		
		return d; //result
	
	}
	
	public boolean dateValidation(String date) {
		
		boolean result = false;
		
		if(date.length() == 10) {
			
			try {
					
					int year = Integer.parseInt(date.substring(0,4));
					int month = Integer.parseInt(date.substring(5,7));
					int day = Integer.parseInt(date.substring(8));
					
					char c1 = date.charAt(4);
					char c2 = date.charAt(7);
					
					if(c1 == '-' && c2 == '-') {
						result = true;
						System.out.println("Date typed: " + year + c1 + month + c2 + day);
					}
					else {
						
						wrongDateMessage(date);
						
					}
					
			}
			catch(NumberFormatException nfe) {
	
				wrongDateMessage(date);
				
			}
			
		}
		else {
			
			wrongDateMessage(date);
			
		}
		
		return result;
		
		
	}
	
	public void wrongDateMessage(String date) {
		
		System.out.println("[DATE FORMAT (YYYY-MM-DD) IS WRONG, YOU HAVE TYPED: " + date + "]");
		
	}
	
	public void printDayOfTheWeek(Date d) {
		
		//System.out.println(d.getDayOfTheWeek());
		
		String date = d.getYear() + "-" + d.getMonth() + "-" + d.getDay();
		LocalDate localDate = LocalDate.now();
		String month = "";
		
		switch(d.getMonth()) {
		
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		
		}
		
		//System.out.println(d);
		
		if(d.getDay() == 0 && d.getMonth() == 0 && d.getYear() == 0) {
			
			wrongDateMessage(date);
			
		}
		else if(date.compareTo(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate)) < 0) {
			
			//System.out.println("less");
			System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " was on " + d.getDayOfTheWeek() + ".");
			
		}
		else if(date.compareTo(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate)) > 0) {
			
			//System.out.println("greater");
			System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " will be on " + d.getDayOfTheWeek() + ".");
			
		}
		//else if(date.compareTo(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate)) == 0){
		else {
			
			//System.out.println("equal");
			System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " is " + d.getDayOfTheWeek() + ".");
			
		}
		
		//System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " was on " + d.getDayOfTheWeek() + ".");
		
	}

}
