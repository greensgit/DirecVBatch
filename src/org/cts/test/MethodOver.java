package org.cts.test;

public class MethodOver {
	
	//class name and method name should be same
	
	//arguments differ
	//no of arguments.
	//datatypes counts
	//datatype order
	
	public void detailsOfStudent() {
			System.out.println("Attending Java class");
	}
	
	public void detailsOfStudent(int age) {
		System.out.println("Age is" +age);
}
	
	
	public void detailsOfStudent(String name) {
		System.out.println("Name is" +name);
}
	
	public void detailsOfStudent(String course,int dob) {
		System.out.println("Course and Dob is" +course +dob);
}

	public void detailsOfStudent(int pincode,String trainername) {
		System.out.println("Pincode and trainer name is" +pincode +trainername);
}

	
	public static void main(String[] args) {
		
		MethodOver m = new MethodOver();
		m.detailsOfStudent();
		m.detailsOfStudent(23);
		m.detailsOfStudent("Deepika");
		m.detailsOfStudent("Selenium", 300997);
		m.detailsOfStudent(600096, "Raj");
	}
	
	
}
