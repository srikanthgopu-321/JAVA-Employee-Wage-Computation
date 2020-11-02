/*public class EmployeeWage {	public static void main(String[] args) {
		System.out.println(
				"-------------------------Welcome to Employee Wage Computation Problem-------------------------");
/*		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int attendance = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println(attendance);
		int empWagePerHour = 20;
		int empHrs = 0;
		int empDailyWage = 0;
		if (attendance == IS_FULL_TIME) {
			System.out.println("Employee is present");
			System.out.println();
			empHrs = 8;
		} else if (attendance == IS_PART_TIME) {
			System.out.println("Employee is present for Part time");
			System.out.println();
			empHrs = 4;

		} else {
			System.out.println("Employee is absent");
			System.out.println();
		}
		empDailyWage = empWagePerHour * empHrs;
		System.out.println("Employee's salary for the day is " + empDailyWage);




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
		empDailyWage = empWagePerHour * empHrs;
		System.out.println("Employee's salary for the day is " + empDailyWage);



int workingDaysInMonth = 20;
		int totalMonthlyWage = 0;
		for (int i = 0; i < workingDaysInMonth; i++) {
//			int attendance = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(attendance);
			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
				System.out.println();
				empHrs = 0;
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
			empDailyWage = empWagePerHour * empHrs;
			System.out.println("Employee's salary for the day is " + empDailyWage);
			totalMonthlyWage += empDailyWage;
		}
		System.out.println("Employee's salary for the month is " + totalMonthlyWage);
	}

*///}


/*int empWagePerHour = 20;
		int empHrs = 0;
		int empDailyWage = 0;
		int workingDaysInMonth = 20;
		int totalMonthlyWage = 0;
		int totalEmpDays = 0;
		int totalHrs = 0;
		int end = 0;
		while (end >= 0) {
			int attendance = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(attendance);
			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
				System.out.println();
				empHrs = 0;
				break;
			case 1:
				System.out.println("Employee is present");
				System.out.println();
				empHrs = 8;
				totalEmpDays++;
				break;
			case 2:
				System.out.println("Employee is present for Part time");
				System.out.println();
				empHrs = 4;
				totalEmpDays++;
				break;
			}
			totalHrs += empHrs;
			empDailyWage = empWagePerHour * empHrs;
			System.out.println("Employee's salary for the day is " + empDailyWage);
			totalMonthlyWage += empDailyWage;
			if (totalEmpDays == 20 || totalHrs == 100) {
				break;
			}
		}
		System.out.println("Employee's salary for the month is " + totalMonthlyWage);
		System.out.println("Total Employee Hours:" + totalHrs + "total Employee days" + totalEmpDays);
	}


/*public class EmployeeWage {

	static int workingDaysInMonth = 20;
	static int workingHoursinMonth = 100;
	static int empWagePerHour = 20;

	public static void main(String[] args) {
		System.out.println(
				"-------------------------Welcome to Employee Wage Computation Problem-------------------------");
		int totalMonthlyWage = empWageForMonth();
		System.out.println("Employee's salary for the month is " + totalMonthlyWage);
	}

	public static int empWageForMonth() {
		int end = 0;
		int empHrs = 0;
		int empDailyWage = 0;
		int totalEmpDays = 0;
		int totalHrs = 0;
		int totalMonthlyWage = 0;
		while (end >= 0) {
			++totalEmpDays;
			int attendance = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(attendance);
			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
				System.out.println();
				empHrs = 0;
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
			totalHrs += empHrs;
			empDailyWage = empWagePerHour * empHrs;
			System.out.println("Employee's salary for the day is " + empDailyWage);
			totalMonthlyWage += empDailyWage;
			if (totalEmpDays == workingDaysInMonth || totalHrs == workingHoursinMonth) {
				break;
			}
		}
		System.out.println("Total Employee Hours: " + totalHrs + " total Employee days " + totalEmpDays);
		return totalMonthlyWage;
	}
}
*/
/*public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRateHours;
	private final int numofWorkDays;
	private final int maxHoursperMonth;

	public EmployeeWage(String company, int empRateHours, int numofWorkDays, int maxHoursperMonth) {
		this.company = company;
		this.empRateHours = empRateHours;
		this.maxHoursperMonth = maxHoursperMonth;
		this.numofWorkDays = numofWorkDays;
	}

	private int calEmpWage() {
		int empHrs = 0, totalEmpHours = 0, totalWorkDays = 0;

		while (totalEmpHours <= maxHoursperMonth && totalWorkDays < numofWorkDays) {
			totalWorkDays++;
			int empCheck = (int) (Math.random() * 10 % 3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHours += empHrs;
			System.out.println("Day: " + totalWorkDays + " Emp Hrs: " + empHrs);
		}
		System.out.println("Total Employee work Hours: " + totalEmpHours);
		return totalEmpHours * empRateHours;
	}

	public static void main(String[] args) {
		System.out.println("*WELCOME TO EMPLOYEE WAGE ");
		EmployeeWage infosys = new EmployeeWage("infosys", 50, 50, 80);
		EmployeeWage google = new EmployeeWage("google", 40, 40, 100);
		System.out.println("Total Employee Wage for " + infosys.company + ": " + infosys.calEmpWage());
		System.out.println("Total Employee Wage for " + google.company + ": " + google.calEmpWage());
	}
}
*/
/*public class EmployeeWage {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;

		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxhoursPerMonth;
		private final String company;
		private int totalEmpWage;
		public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxhoursPerMonth)
		{
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxhoursPerMonth=maxhoursPerMonth;
		}
		public void computeEmpWage() {
			int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
			while (totalEmphrs < maxhoursPerMonth && totalworkingdays < numOfWorkingDays) {
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
			totalEmpWage = totalEmphrs * empRatePerHour;
			
		}
		//@override
		public String toString(){
		return "Total Emp wages for company " +company+ "is" +totalEmpWage;
		}

		public static void main(String[] args) {
			EmployeeWage info = new EmployeeWage("infosys" ,20,2,10);
			EmployeeWage cogni = new EmployeeWage("cognizath" ,40,4,20);
			info.computeEmpWage();
			System.out.println(info);
			cogni.computeEmpWage();
			System.out.println(cogni);
			
		}
}

*/

/*public class EmployeeWage {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;

		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxhoursPerMonth;
		private final String company;
		private int totalEmpWage;
		public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxhoursPerMonth)
		{
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxhoursPerMonth=maxhoursPerMonth;
		}
		public void computeEmpWage() {
			int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
			while (totalEmphrs < maxhoursPerMonth && totalworkingdays < numOfWorkingDays) {
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
			totalEmpWage = totalEmphrs * empRatePerHour;
			
		}
		//@override
		public String toString(){
		return "Total Emp wages for company " +company+ "is" +totalEmpWage;
		}

		public static void main(String[] args) {
			EmployeeWage info = new EmployeeWage("infosys" ,20,2,10);
			EmployeeWage cogni = new EmployeeWage("cognizath" ,40,4,20);
			info.computeEmpWage();
			System.out.println(info);
			cogni.computeEmpWage();
			System.out.println(cogni);
			
		}
}

*/
/*import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWage implements IComputeEmpWage {
public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;

private int numofCompany=0;
private CompanyEmpWage[] companyEmpWageArray;

public EmployeeWage() {
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
IComputeEmpWage empWageBuilder = new EmployeeWage();
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
*/
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class EmployeeWage {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private final String company;
	private final int RATE_PER_HOUR;
	private final int workingDays;
	private final int maxHours;
	private int totalEmpWages; 
	
	public EmployeeWage(String company,int RATE_PER_HOUR,int workingDays,int maxHours) {
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
			 case IS_FULL_TIME : empHours=8;
			 					 break;
			 case IS_PART_TIME : empHours=4;
			 					 break;
			 default : empHours=0;
			}
			totalEmpHours+=empHours;
			//System.out.println("Day :"+totalWorkingDays+"Emp Hours :"+empHours);
			
		}
		//System.out.println("Total Employee work Hours :"+totalEmpHours);
		totalEmpWages=totalEmpHours*RATE_PER_HOUR;
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for Company :"+company+"is:"+totalEmpWages;
	}
	public static void main(String[] args) {
		System.out.println("========Welcome to Employee Wage Computation========");
		EmployeeWage fab=new EmployeeWage("Facebook",20,200,100);
		EmployeeWage app=new EmployeeWage("Apple",35,100,100);
		fab.Calculation();
		System.out.println(fab);
		app.Calculation();
		System.out.println(app);
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
		return "Total Emp Wage for Company "+company+" is :"+totalEmpWage;
	}

}
interface IComputeEmpWage {
	public void addCompanyEmpWage(String company,int empRateperHour,int workingDays,int maxHours);
	public void computeEmpWage();
	}






