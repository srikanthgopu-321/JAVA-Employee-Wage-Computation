
public class EmployeeWage {	
public static void main(String[] args) {
		System.out.println(
				"-------------------------Welcome to Employee Wage Computation Problem-------------------------");
		int IS_FULL_TIME = 1;
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

}




















//	}



//}
