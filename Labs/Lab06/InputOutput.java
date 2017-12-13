package ca.ciccc.java.view;

public class InputOutput extends Exception{
	
	public InputOutput() {
		
		
		
	}
	
	public String[] splitDate(String date) {
		
		String[] s;
		
		s = date.split("-");
		
		return s;
	
	}
	
	private boolean dateValidation(String date) {
		
		boolean result = false;
		
		//1111-11-11
		try {
			
			int year = Integer.parseInt(date.substring(0,4));
			int month = Integer.parseInt(date.substring(5,7));
			int day = Integer.parseInt(date.substring(8));
		
		}
		catch(NumberFormatException nfe) {
			
			nfe.getMessage();
			
		}
		
		char s4 = date.charAt(4);
		char s5 = date.charAt(7);
		
		return result;
		
		
	}

}
