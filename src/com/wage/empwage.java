package com.wage;

public class empwage {

	

//initialisation and declaration
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		
		private final String COMPANY_NAME;
		private final int RATE_PER_HOUR;
		private final int MAX_DAYS;
		private final int MAX_HOURS;
//calling using constructor
		empwage(String COMPANY_NAME, int RATE_PER_HOUR, int MAX_HOURS, int MAX_DAYS) {
			this.COMPANY_NAME = COMPANY_NAME;
			this.RATE_PER_HOUR = RATE_PER_HOUR;
			this.MAX_DAYS = MAX_DAYS;
			this.MAX_HOURS = MAX_HOURS;
		}
//funtionality to compute the wage
		public void computeWage() {
			int empHour = 0;
			int empWage = 0;
			int totalWage = 0;
			int totalEmpHours = 0;
			int totalEmpDays = 0;
			while (totalEmpHours < MAX_HOURS && totalEmpDays < MAX_DAYS) {
				totalEmpDays += 1;
				int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
				switch (empCheck) {
				case FULL_TIME:
					empHour = 16;
					break;
				case PART_TIME:
					empHour = 8;
					break;
				default:
					empHour = 0;
				}
				totalEmpHours += empHour;
				empWage = empHour * RATE_PER_HOUR;
				totalWage += empWage;
			}
			System.out.println("\ncompany name is" + COMPANY_NAME);
			System.out.println("Employee wage is " + totalWage);
			System.out.println("Total working hours is " + totalEmpHours);
			System.out.println("Total working days is " + totalEmpDays);
		}
//main method to compute of different companies
		public static void main(String args[]) {

			empwage abc = new empwage("ABC", 40, 140, 50);
			abc.computeWage();
			empwage def = new empwage("DEF", 60, 120, 35);
			def.computeWage();
		}
	}