package com.wage;

public class CompanyWage {
	public final String company;
	public final int ratePerHour;
	public final int maxDays;
	public final int maxHours;
	public int totalWage;

	/**
	 * parameterised constructor to initialise member of class
	 * 
	 * @param company
	 * @param ratePerHour
	 * @param maxHours
	 * @param maxDays
	 */
	public CompanyWage(String company, int ratePerHour, int maxHours, int maxDays) {
		this.company = company;
		this.ratePerHour = ratePerHour;
		this.maxDays = maxDays;
		this.maxHours = maxHours;
	}

	/**
	 * method to set total employee wage
	 * 
	 * @param totalWage
	 */
	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for company: " + company + "is: " + totalWage;
	}

}
