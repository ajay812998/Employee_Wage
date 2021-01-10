package com.bridgelabz;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empwage = 0;
		int attendance = (int) Math.round(Math.random() * 10) % 3;
		switch (attendance) {
		case 0:
		         System.out.println("Employee is absent");
		         System.out.println();
		         break;
		case 1:
		         System.out.println("Employee is present");
		         System.out.println();
		         empHrs = 8;
		         break;
		case 2:
		         System.out.println("Employee is present for Part time");
		         System.out.println();
		         empHrs = 4;
		         break;
		}
		empwage = EMP_RATE_PER_HOUR * empHrs;
		System.out.println("Employee's salary for the day is " + empwage);
	}
}
