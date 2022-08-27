package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");	
		
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int WORKING_DAYS = 20;
		
		int totalWage = 0;
		
		for(int day = 1; day <= WORKING_DAYS; day++ ) {
			
			int empCheck = (int) (Math.random() * 100) % 3;
			int empFullDayWrkHrs = 0;
			
			switch(empCheck) {
			 case  IS_FULL_TIME :
				  empFullDayWrkHrs = 16;
	              break;
	            
	         case  IS_PART_TIME:
	        	  empFullDayWrkHrs = 8;
	              break;
	             
	          default:
			}
			
			int empWage = empFullDayWrkHrs * WAGE_PER_HOUR;
            System.out.println("Day " + day + " wage is:" + empWage);
            totalWage += empWage;
        }
		
         System.out.println("Total wage for a month = " + totalWage);   
	}

}
