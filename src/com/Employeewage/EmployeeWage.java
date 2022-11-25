package com.Employeewage;

public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	

		public static void computeEmpWage(String company, int empRatePerHour,
				                          int numOfWorkingDays, int maxHoursPerMonth) {
			
			int empHrs = 0;
			int totalWorkingDays = 0;
			int totalEmpHrs = 0;
			while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
				totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_PART_TIME:
			     empHrs = 4;
			     break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays + "emp hr:" +empHrs);

		}
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("total emp wage for company: " +company+" is: "+ totalEmpWage);
    }
		public static void main(String[] args) {
         computeEmpWage("Dmart",20,2,10);
         computeEmpWage("Big Bazar", 10, 4, 10);
		}

}
