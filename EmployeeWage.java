public class EmployeeWage{
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation");
	int IS_FULL_TIME = 1;
			int attendance = (int) (Math.round(Math.random()));
			if (attendance == IS_FULL_TIME)
				System.out.println("Employee is present");
			else
				System.out.println("Employee is absent");
//	int IS_FULL_TIME = 1;
//		int attendance = (int) (Math.round(Math.random()));
		int empWagePerHour = 20;
		int empHrs = 0;
		int empDailyWage = 0;
		if (attendance == IS_FULL_TIME) {
			System.out.println("Employee is present");
			System.out.println();
			empHrs = 8;
		} else
		{
			System.out.println("Employee is absent");
		System.out.println();
		}
		empDailyWage=empWagePerHour*empHrs;
		System.out.println("Employee's salary for the day is "+empDailyWage);
	}
}
