package com.bridgelabz;

public class Employeewage {
		

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private final String company;
	private final int RATE_PER_HOUR;
	private final int workingDays;
	private final int maxHours;
	private int totalEmpWages; 
	
	public Employeewage(String company,int RATE_PER_HOUR,int workingDays,int maxHours) {
		this.company=company;
		this.RATE_PER_HOUR=RATE_PER_HOUR;
		this.workingDays=workingDays;
		this.maxHours=maxHours;
		}
	public void Calculation() {
		int empHours=0,totalEmpHours=0,totalWorkingDays=0;
		
		while(totalEmpHours<=maxHours && totalWorkingDays<workingDays) {
			totalWorkingDays++;
			int check=(int) (Math.floor(Math.random()*10)%3);
			switch(check) {
			 case IS_FULL_TIME :
				 empHours=8;
			 	 break;
			 case IS_PART_TIME : 
				 empHours=4;
			 	 break;
			 default :
				 empHours=0;
			}
			totalEmpHours+=empHours;
			System.out.println("Day :"+totalWorkingDays+"Emp Hours :"+empHours);
			
		}
		System.out.println("Total Employee work Hours :"+totalEmpHours);
		totalEmpWages=totalEmpHours*RATE_PER_HOUR;
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for Company :"+company+"is:"+totalEmpWages;
	}
	public static void main(String[] args) {
		Employeewage Idea=new Employeewage("Idea",20,15,125);
		Employeewage Airtel=new Employeewage("Airtel",30,10,150);
		Idea.Calculation();
		System.out.println(Idea);
		Airtel.Calculation();
		System.out.println(Airtel);
	 }
}