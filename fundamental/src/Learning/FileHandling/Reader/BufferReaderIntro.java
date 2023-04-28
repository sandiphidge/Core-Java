package Learning.FileHandling.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferReaderIntro {
	public static void main(String[] args) {
		char[]ch = new char[100];
		try {
			FileReader reader = new FileReader("C:\\Users\\sande\\OneDrive\\Desktop\\FilesFolder\\File4.txt");
			BufferedReader buffer = new BufferedReader(reader);
			buffer.read(ch);
			System.out.println(ch);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
       } catch (IOException e) {
		
		e.printStackTrace();
	}
	

	}

}
