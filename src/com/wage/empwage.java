package com.wage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class empwage {

	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	
	
	private LinkedList<CompanyWage> companyWageList;
	private Map<String, CompanyWage> companyToEmpWageMap;

	empwage() {
		companyWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	/**
	 * method to add company detail to companyEmpWageArr
	 */
	public void addCompanyWage(String company, int ratePerHour, int maxHours, int maxDays) {
		CompanyWage companyWage = new CompanyWage(company, ratePerHour, maxHours, maxDays);
		companyWageList.add(companyWage);
		companyToEmpWageMap.put(company, companyWage);
	}
	/**
	 * method to set total employee wage for each company
	 */
	public void computeEmpWage() {
		for (int i = 0; i < companyWageList.size(); i++) {
			CompanyWage companyEmpWage = companyWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeWage(companyEmpWage));
			System.out.println(companyEmpWage);

		}
	}
	public  int getTotalWage(String company)
	{
		return companyToEmpWageMap.get(company).totalWage;
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
			System.out.println("\ndaily wage is "+empWage);
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