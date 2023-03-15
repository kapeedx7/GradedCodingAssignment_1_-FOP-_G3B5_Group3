package graded.coding.assignment1.departmentsPackage;

import graded.coding.assignment1.superDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	// OverRidding ParentMethod
	public String departmentName() {
		return "Welcome to Tech Department";
	}

	// OverRidding ParentMethod
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	// OverRidding ParentMethod
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
