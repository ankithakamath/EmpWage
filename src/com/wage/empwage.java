package com.wage;

public class empwage {

	

		
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		
		public static int computeEmpwage (String company, int wageperhour, int totalworkingdays, int numofdays) {
			
		
		int wageperHour = 0, fullDayHours = 0, totalWorkingHours = 0, totalWorkingDays = 0,empwage = 0;
		while (totalWorkingHours <=fullDayHours && totalWorkingDays < numofdays) {
			totalWorkingDays++;
			int presence = (int) Math.floor(Math.random() * 10) % 3;
			switch (presence) {
			case FULL_TIME:
				fullDayHours =8;
				
				break;
			case PART_TIME:
				fullDayHours = 4;
				
				break;
			default:
				fullDayHours = 0;
				break;
			}
			totalWorkingHours+=fullDayHours;
			System.out.println("Total workin hours " +totalWorkingHours);
		}//toCalculate the employee wage, total wage and Total working hours
			empwage = totalWorkingHours * wageperHour;

		System.out.println("Total employee wage for the company "  +company +"is" + empwage);
		return empwage;
		
	}
public static void main(String[] args) {
	computeEmpwage("supermart",20,2,10);
	computeEmpwage("skmart",10,4,20);
}
}