package Learning.OOP.Abstraction;

abstract class Dept{
	public String deptName() {
		return "Accounts";
		
	}
	abstract public String professorName();
	
}
abstract class HOD extends Dept{
	
}
class SeniorProfessor extends HOD{
	public String professorName() {
		return "Dr.CDE";
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//           Dept dept = new Dept();
             Dept dept = new SeniorProfessor();
            String name=  dept.professorName();
            System.out.println(name);

}
}
