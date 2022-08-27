package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		
		int empFullDayWrkHrs = 0;
		int empCheck = (int) (Math.random() * 100) % 3;
		
		if(IS_FULL_TIME == empCheck) {
			
			System.out.println("Employee is Present FullTime");
			empFullDayWrkHrs = 16;
		}
		else if (IS_PART_TIME == empCheck) {
			
			System.out.println("Employee is Present PartTime");
			empFullDayWrkHrs = 8;
		}
		else {
			System.out.println("Employee is Absent");
		}
		
		int empWage = empFullDayWrkHrs * WAGE_PER_HOUR;
		System.out.println("Employee Daily Wage is " + empWage);
	}

}
