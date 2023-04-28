package Learning.FileHandling.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationIntro {

	public static void main(String[] args) {
		Employee emp = null;
		try {
			FileInputStream inputStream = new FileInputStream("C:\\Users\\sande\\OneDrive\\Desktop\\FilesFolder\\serialize.txt");
			ObjectInputStream objectStream = new ObjectInputStream(inputStream);
		emp =(Employee)objectStream.readObject();
		
		System.out.println("After Deserialiaion :");
		System.out.println(emp.empId);
		System.out.println(emp.empName);
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
