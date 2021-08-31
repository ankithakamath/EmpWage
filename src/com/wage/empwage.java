package com.wage;

public class empwage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage Computation");
		final int FULL_TIME = 1;
		final int PART_TIME = 2;
		int wageperHour = 20, fullDayHours = 0, totalWorkingHours = 0, totalWorkingDays = 0,empwage = 0, totalwage = 0;
		while (totalWorkingHours < 100 || totalWorkingDays < 20) {
			int presence = (int) Math.floor(Math.random() * 10) % 3;
			switch (presence) {
			case FULL_TIME:
				fullDayHours = 8;
				totalWorkingDays += 1;
				break;
			case PART_TIME:
				fullDayHours = 4;
				totalWorkingDays += 1;
				break;
			default:
				fullDayHours = 0;
				break;
			}
			//toCalculate the employee wage, total wage and Total working hours
			empwage = fullDayHours * wageperHour;
			totalwage += empwage;
			totalWorkingHours += fullDayHours;
			System.out.println("Employee wage for a single day " + empwage);
		}
		System.out.println("Total employee wage " + totalwage);
		System.out.println("Total workin hours " +totalWorkingHours);
	}
}
