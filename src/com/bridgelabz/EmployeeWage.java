package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");	
		
		final int IS_FULL_TIME = 1;	
		final int WAGE_PER_HOUR = 20;
		
		int empFullDayWrkHrs = 0;
		int empCheck = (int) (Math.random() * 100) % 2;
		
		if(empCheck == IS_FULL_TIME) {
			
			System.out.println("Employee is Present");
			empFullDayWrkHrs = 8;
			
		}
		else {
				 System.out.println("Employee is Absent");
		}	
		
		int empWage = empFullDayWrkHrs * WAGE_PER_HOUR;
		System.out.println("Employee Daily Wage is " + empWage);
	}

}
