package Learning.FileHandling.Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderIntro {

	public static void main(String[] args) {
	char[]arr = new char [100];
	try {
		FileInputStream fileinputstream = new FileInputStream("C:\\Users\\sande\\OneDrive\\Desktop\\FilesFolder\\File4.txt");
		InputStreamReader reader = new InputStreamReader(fileinputstream);
		reader.read(arr);
		System.out.println(arr);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}

}
