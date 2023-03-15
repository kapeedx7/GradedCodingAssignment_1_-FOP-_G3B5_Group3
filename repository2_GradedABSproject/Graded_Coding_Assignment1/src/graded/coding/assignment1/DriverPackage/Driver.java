package graded.coding.assignment1.DriverPackage;

import graded.coding.assignment1.departmentsPackage.AdminDepartment;
import graded.coding.assignment1.departmentsPackage.HrDepartment;
import graded.coding.assignment1.departmentsPackage.TechDepartment;

public class Driver {
	public static void main(String[] args) {

		// Admin Department WorkFlow
		AdminDepartment a1 = new AdminDepartment();
		System.out.println(a1.departmentName());
		System.out.println(a1.getTodaysWork());
		System.out.println(a1.getWorkDeadline());
		System.out.println(a1.isTodayAHoliday());
		System.out.printf("\n\n");

		// HR Department WorkFlow
		HrDepartment h1 = new HrDepartment();

		System.out.printf(h1.departmentName() + "\n" + h1.doActivity() + "\n" + h1.getTodaysWork() + "\n"
				+ h1.getWorkDeadline() + "\n" + h1.isTodayAHoliday());

		// Tech Department WorkFlow
		TechDepartment t1 = new TechDepartment();

		System.out.printf("\n\n" + t1.departmentName() + "\n" + t1.getTodaysWork() + "\n" + t1.getWorkDeadline() + "\n"
				+ t1.getTechStackInformation() + "\n" + t1.isTodayAHoliday());

	}

}
