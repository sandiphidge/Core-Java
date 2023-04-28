package Learning.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro {

	public static void main(String[] args) throws IOException {
	//Using Relative path:
		File file =new File("newFile.txt");
		try {
			
		boolean result = file.createNewFile();
		if(result) {
			System.out.println("File created successfully");
		}else {
			System.out.println("There is some error while crating new file");
		}
		} catch(IOException e) {
			System.out.println("Exception handled successfully");
		}
	} 

}
