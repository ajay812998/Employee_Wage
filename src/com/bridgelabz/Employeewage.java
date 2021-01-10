package com.bridgelabz;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		int IS_FULL_TIME = 1;
		double attendance = Math.round(Math.random() * 10) % 2;
		if (attendance == IS_FULL_TIME)
		    System.out.println("Employee is present");
		else
		    System.out.println("Employee is absent");
	}
}
