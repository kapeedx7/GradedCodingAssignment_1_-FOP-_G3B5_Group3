package graded.coding.assignment1.departmentsPackage;

import graded.coding.assignment1.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	// OverRidding ParentMethod
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	// OverRidding ParentMethod
	public String getTodaysWork() {
		return "Complete your Document Submission";
	}

	// OverRidding ParentMethod
	public String getWorkDeadline() {
		return "Complete By EOD";
	}

}
