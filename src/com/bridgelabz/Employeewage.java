package com.bridgelabz;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empwage = 0;
		double attendance = Math.round(Math.random() * 10) % 3;
		if (attendance == IS_FULL_TIME) 
		    empHrs = 8;
		 else if (attendance == IS_PART_TIME)
			empHrs = 4;
			else
			empHrs=0;
		
		empwage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empwage);
	}
}
