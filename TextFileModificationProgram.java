package lessionThree.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileModificationProgram {
	static void modifyFile(String filePath, String oldString, String newString) {
		
		File fileToBeModified = new File(filePath);
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			//it will read the file
			while (line != null) {
			//until it doesn't encounter null, will continue
				oldContent = oldContent + line + System.lineSeparator();//old content is updated, 
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);//replace 85 with 95
			writer = new FileWriter(fileToBeModified);
			writer.write(newContent);//new content will be written in the file
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		modifyFile(
				"D:\\\\\\\\Vishal\\\\\\\\Full Stack Java Developer\\\\\\\\"
				+ "Lesson3\\\\\\\\src\\\\\\\\fileHandling//testFile3.txt",
				"85", "95");
		System.out.println("done");
	}
}
