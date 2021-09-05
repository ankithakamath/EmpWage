package com.wage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class empwage  {

	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyWage[] companyWageArr;
	
	private LinkedList<CompanyWage> companyEmpWageList;
	private Map<String, CompanyWage> companyToEmpWageMap;

	empwage() {
		companyWageArr = new CompanyWage[5];
	}

	/**
	 * method to add company detail to companyEmpWageArr
	 */
	public void addCompanyWage(String company, int ratePerHour, int maxHours, int maxDays) {
		companyWageArr[numOfCompany] = new CompanyWage(company, ratePerHour, maxHours, maxDays);
		numOfCompany++;
	}

	/**
	 * method to set total employee wage for each company
	 */
	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyWageArr[i].setTotalEmpWage(this.computeWage(companyWageArr[i]));
			System.out.println(companyWageArr[i]);
		}
	}

	/**
	 * method to compute total employee wage for each company
	 * 
	 * @param companyEmpWage
	 * @return totalWage
	 */
	public int computeWage(CompanyWage companyEmpWage) {
		int empHour = 0;
		int empWage = 0;
		int totalWage = 0;
		int totalEmpHours = 0;
		int totalEmpDays = 0;
		while (totalEmpHours < companyEmpWage.maxHours && totalEmpDays < companyEmpWage.maxDays) {
			totalEmpDays += 1;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHour = 16;
				break;
			case IS_PART_TIME:
				empHour = 8;
				break;
			default:
				empHour = 0;
			}
			totalEmpHours += empHour;
			empWage = empHour * companyEmpWage.ratePerHour;
			totalWage += empWage;
		}
		System.out.println("\ncompany name is" + companyEmpWage.company);
		System.out.println("Employee wage is " + totalWage);
		System.out.println("Total working hours is " + totalEmpHours);
		System.out.println("Total working days is " + totalEmpDays);
		return totalWage;
	}

	public static void main(String args[]) {

		empwage empWageBuilder = new empwage();

		empWageBuilder.addCompanyWage("ABC", 30, 140, 20);
		empWageBuilder.addCompanyWage("DEF", 20, 100, 20);
		empWageBuilder.computeEmpWage();
	}
}