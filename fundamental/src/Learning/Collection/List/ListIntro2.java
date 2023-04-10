package Learning.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	int empId;
	String empname;
	
	
	Employee(int empId,String empName){
		this.empId = empId;
		this.empname = empName;
	}

public String toString(){
	return empId+" "+empname;
}
}

public class ListIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee (121,"Anuj");
		Employee e2 = new Employee (131,"San");
		Employee e3 = new Employee (141,"A");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(131,"Ankit"));
		list2.add(new Employee(132,"Raj"));
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
		//add object based on index
		
		List<Employee> list3 = new ArrayList<>();
		list3.add(new Employee (1001,"Nilesh"));
		list.addAll(2, list3);
		
		System.out.println(list);
		
		//is Empty
		System.out.println(list.isEmpty());
		
		//get(index)
		System.out.println(list.get(3));
		
		//Iterator
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//remove
//			System.out.println(list.remove(e2));
//			System.out.println(list);
			
			
			//
//			System.out.println(list.indexOf(e3));
			
			while(itr.hasNext()) {
				Employee emp = itr.next();
				if (emp.empname.startsWith("A")) {
					System.out.println(emp);
				}
			}
		}
	}

}

