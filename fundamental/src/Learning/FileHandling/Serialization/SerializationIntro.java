package Learning.FileHandling.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public int empId;
	public String empName;
	
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
}




public class SerializationIntro {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Arjun");
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\sande\\OneDrive\\Desktop\\FilesFolder\\serialize.txt");
			ObjectOutputStream objectWriter = new ObjectOutputStream(output);
			objectWriter.writeObject(emp);
			System.out.println("Object serialization achieved..");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
