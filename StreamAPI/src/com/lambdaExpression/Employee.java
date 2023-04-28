package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

class Employee1{
	private String firstName;
	private String lastName;
	private int  age;
	
	public Employee1(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	 public String getFirstName() {
		return firstName;
	}
	
}


     public class Employee {

	 public static void main(String[] args) {
		List <Employee1> employees1 = new ArrayList<>();
		employees1.add(new Employee1("Hruta","Sandip", 05));
		employees1.add(new Employee1("Rohan","Varma", 36));
		employees1.add(new Employee1("Kiran","Sharma", 34));
		
		GetName<Employee1> getName = list ->list.stream().map(Employee1::getFirstName).toArray(String[]::new);
		String[] names = getName.getName(employees1);
		for(String name : names) {
			System.out.println(name);
		}
		

	}
    interface GetName<E>{
	String[] getName(List<E> list);
//@FunctionalInterface
//interface FirstName{
//	String[]getFname(List<Employee> list);
        
//public class Employee1 {
//	private int empId;
//	private String empfname;
//	private String emplname;
//	public Employee1(int empId, String empfname, String emplname) {
//		super();
//		this.empId = empId;
//		this.empfname = empfname;
//		this.emplname = emplname;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getEmpfname() {
//		return empfname;
//	}
//	public void setEmpfname(String empfname) {
//		this.empfname = empfname;
//	}
//	public String getEmplname() {
//		return emplname;
//	}
//	public void setEmplname(String emplname) {
//		this.emplname = emplname;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empfname=" + empfname + ", emplname=" + emplname + "]";
//	}
//
//	}
//public class Employee {
//
//	 public static void main(String[] args) {
//		 Employee1 e1 = new Employee1(101,"Akash","Kumar");
//		 Employee1 e2 = new Employee1(101,"Akash","Kumar");	 
//		 Employee1 e3 = new Employee1(101,"Akash","Kumar");
//		 Employee1 e4 = new Employee1(101,"Akash","Kumar");
//		 Employee1 e5 = new Employee1(101,"Akash","Kumar");
//		 
//		 List<Employee1> list = new ArrayList<>();
//		 list.add(e1);
//		 list.add(e2);
//		 list.add(e3);
//		 list.add(e4);
//		 list.add(e5);
//		 String[] getName = new String[list.size()];
//		 FirstName fname = (myList)->{
//			 for (int i=0;i<getName.length;i++) {
//				 getName[i] = myList.get(i).getEmpfname();
//			 }
//			 return getName;
//		 };
//		 String[] result = new String[list.size()];
//		 result = fname.getFname(list);
//		 for(String empFname:result) {
//			 System.out.println(empFname);
//		 }
	 }
}
	 
