package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Employeewage implements IComputeEmpWage  {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	private int numofCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public Employeewage() {
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company,int empRatePerHour,int workingDays,int maxHours) {
		companyEmpWageArray[numofCompany]=new CompanyEmpWage(company,empRatePerHour,workingDays,maxHours);
		numofCompany++;
	}


	public void computeEmpWage(){
		for (int i=0;i<numofCompany;i++){
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWages(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
			}
		}
		private int computeEmpWages(CompanyEmpWage companyEmpWage) {
				int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
				while (totalEmphrs < companyEmpWage.maxHours && totalworkingdays < companyEmpWage.workingDays) 
				{
					totalworkingdays++;
					int random = (int) Math.floor(Math.random() * 10) % 3;
					switch (random) {

					case 1:
						emphrs = 8;
						break;

					case 2:
						emphrs = 4;
						break;

					default:
						emphrs = 0;// not present

					}
					totalEmphrs += emphrs;
					System.out.println("days" +totalworkingdays+ "Emphrs" +emphrs);
				}
				return totalEmphrs+companyEmpWage.empRateperHour;
				
		}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	IComputeEmpWage empWageBuilder = new Employeewage();
	empWageBuilder.addCompanyEmpWage("facebook",20,2,10);
	empWageBuilder.addCompanyEmpWage("apple",10,4,20);
	empWageBuilder.computeEmpWage();
	}
	}
	class CompanyEmpWage {
		public final String company;
		public final int empRateperHour;
		public final int workingDays;
		public final int maxHours;
		public int totalEmpWage;
		
		public CompanyEmpWage(String company,int empRatePerHour,int workingDays,int maxHours) {
			this.company=company;
			this.empRateperHour=empRatePerHour;
			this.workingDays=workingDays;
			this.maxHours=maxHours;
		}
		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpWage=totalEmpWage;
		}
		@Override
		public String toString() {
			return "Total Emp Wage for Company :"+company+"is :"+totalEmpWage;
		}

	}
	interface IComputeEmpWage {
		public void addCompanyEmpWage(String company,int empRateperHour,int workingDays,int maxHours);
		public void computeEmpWage();
		}
