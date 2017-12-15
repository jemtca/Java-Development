package ca.ciccc.java.view;

import ca.ciccc.java.model.Date;

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
		
		System.out.println(Integer.valueOf(s[2]));
		System.out.println(Integer.valueOf(s[1]));
		System.out.println(Integer.valueOf(s[0]));
		System.out.println(d);
		
		
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
		
		System.out.println("Date format (yyyy-mm-dd) is wrong, you have typed: " + date);
		
	}
	
	public void printDayOfTheWeek(Date d) {
		
		//System.out.println(d.getDayOfTheWeek());
		
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
		
		System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " was on " + d.getDayOfTheWeek() + ".");
		
		
	}

}
