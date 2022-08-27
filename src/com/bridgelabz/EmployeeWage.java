package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		
		int empCheck = (int) (Math.random() * 100) % 3;
		int empFullDayWrkHrs = 0;
		switch(empCheck)
		{
		case IS_FULL_TIME :
            System.out.println("Employee is Present Full time");
            empFullDayWrkHrs = 16;
            break;
            
        case IS_PART_TIME:
            System.out.println("Employee is Present Part time");
            empFullDayWrkHrs = 8;
            break;
            
        default:
            System.out.println("Employee is Absent");  
		}
		
		int empWage = WAGE_PER_HOUR * empFullDayWrkHrs;
		System.out.println("Employee Daily Wage is " + empWage);
	}

}
