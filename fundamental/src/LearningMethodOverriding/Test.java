package LearningMethodOverriding;

class Employee{
	public void calculateSalary() {
		System.out.println("Salary: 1000*30");
	}
}

class PTE extends Employee{  //PTE=Part Time Employee
	@Override

	public void calculateSalary() {
		System.out.println("Salary: 300*30");
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee=new Employee();
         
         
	}

}
