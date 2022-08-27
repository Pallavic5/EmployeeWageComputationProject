package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 100;
        
        int empFullDayWrkHrs = 0;
        int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < WORKING_DAYS) {
			
			totalWorkingDays++;

			int empCheck = (int) (Math.random() * 100) % 3;

			switch(empCheck) {
			case  IS_FULL_TIME :
				  empFullDayWrkHrs = 16;
	              break;
	            
	        case  IS_PART_TIME:
	        	  empFullDayWrkHrs = 8;
	              break;
	             
	         default:
			}

			totalEmpHrs += empFullDayWrkHrs ;
			System.out.println("Day " + totalWorkingDays + " : Employee Maximum Working Hours are " + empFullDayWrkHrs );
		}
		
		int totalWage = totalEmpHrs * WAGE_PER_HOUR;
		System.out.println("Total Employee Wage for month is " + totalWage);
	}

}
