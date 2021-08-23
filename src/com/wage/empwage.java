package com.wage;

public class empwage {

	public static void main(String[] args) {
		System.out.println("welcome to EmpWage");
		final int IS_FULL_TIME =1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent"); 
		
		final int IS_PART_TIME =2;
		int rate_per_hr =20;
		int emp_hrs=0;
		int emp_wage=0;
		int no_of_working_days=20;
		int total_wage=0;
		int total_emp_hrs=0;
		int max_hrs=100;
		int max_days=20;
		int total_emp_days=0;
		while(total_emp_hrs<max_hrs &&total_emp_days<max_days)
		{
			total_emp_days+=1;
		
		switch ((int)empCheck) {
		case  IS_FULL_TIME: emp_hrs=16;break;
		case IS_PART_TIME: emp_hrs=8;break;
		default: emp_hrs=0;
		}
		total_emp_hrs+=emp_hrs;
		emp_wage=emp_hrs*rate_per_hr ;
		total_wage+=emp_wage;
		}			
		System.out.println("Employee wage is "+total_wage);
		System.out.println("Total working hours is "+total_emp_hrs);
		System.out.println("Total working days is "+total_emp_days);
			
			}

		}
		
