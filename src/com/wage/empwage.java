package com.wage;

public class empwage {

	public static void main(String[] args) {
		//System.out.println("welcome to EmpWage");
		//final int IS_FULL_TIME =1;
		//double empCheck=Math.floor(Math.random()*10)%2;
		//if (empCheck==IS_FULL_TIME)
			//System.out.println("Employee is present");
		//else
			//System.out.println("Employee is absent"); 
		final int IS_FULL_TIME =1;
		int rate_per_hr =20;
		int emp_hrs=0;
		int emp_wage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)
			emp_hrs=8;
			emp_wage=emp_hrs*rate_per_hr ;
					
			System.out.println("Employee wage is "+emp_wage);
			}

}
