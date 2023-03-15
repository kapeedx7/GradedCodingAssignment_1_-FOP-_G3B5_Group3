package graded.coding.assignment1.departmentsPackage;

import graded.coding.assignment1.superDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	// OverRidding ParentMethod
	public String departmentName() {
		return "Welcome to HR Department";
	}

	// OverRidding ParentMethod
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	// OverRidding ParentMethod
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
