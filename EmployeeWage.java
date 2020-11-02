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
public class EmployeeWage {
	
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















