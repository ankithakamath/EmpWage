package com.wage;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int ratePerHour, int maxHours, int maxDays);

	public void computeEmpWage();

	int getTotalWage(String company);
}
