package Learning.FileHandling.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamIntro {

	public static void main(String[] args) {
	byte[] arr = new byte[100];
	try {
		
	InputStream input = new FileInputStream("C:\\Users\\sande\\OneDrive\\Desktop\\FilesFolder\\newFile2.txt");
	System.out.println("Available bytes in file :"+input.available());
	input.read(arr);
	for (byte data:arr) {
		System.out.println(data);
	}
	System.out.println(input);
	String data = new String (arr);
	System.out.println(data);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
