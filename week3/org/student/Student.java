package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Student name is Yogi");
	}
	
	public void studentdept() {
		
		System.out.println("Student dept is ECE");
	}
	
	public void studentId() {
		
		System.out.println("Student id is 1330094");
	}

	public static void main(String[] args) {
		
		Student info=new Student();
		
		info.collegeName();
		info.collegeCode();
		info.collegeRank();
		info.deptName();
		info.studentName();
		info.studentdept();
		info.studentId();
		
		
		

	}

}
