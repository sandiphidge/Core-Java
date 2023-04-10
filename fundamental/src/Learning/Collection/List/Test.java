package Learning.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeInfo implements Comparable<EmployeeInfo>{
	
	String name;
	int salary;
	EmployeeInfo(String name,int salary){
		this.salary = salary;
		
	}
	
	public String toString() {
		return name+" "+salary;
	}
		
		public int compareTo(EmployeeInfo o) {
			return o.salary - this.salary;
		}
		
	}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeInfo e1 = new EmployeeInfo("A",1000);
EmployeeInfo e2 = new EmployeeInfo ("B",3000);
EmployeeInfo e3 = new EmployeeInfo ("c",2000);

List<EmployeeInfo>list = new ArrayList<>();
list.add(e3);
list.add(e2);
list.add(e1);



System.out.println(list);
Collections.sort(list);
System.out.println(list);
	}

}

