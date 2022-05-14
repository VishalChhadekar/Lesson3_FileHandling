package lessionThree.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileReadingWriting {
	public static void main(String[] args) throws IOException {
//		createFileUsingFileClass(
//				"D:\\\\\\\\Vishal\\\\\\\\Full Stack Java Developer"
//				+ "\\\\\\\\Lesson3\\\\\\\\src\\\\\\\\fileHandling//testFile4.txt");
		
		
		createFileUsingFileClass(
				"D:\\Vishal\\Full Stack Java Developer//textFile1");
//		createFileUsingFileOutputStreamClass();
//        createFileIn_NIO();
	}

//	private static void createFileUsingFileClass() throws IOException {
//		File file = new File("D:\\Vishal\\Full Stack Java Developer\\Lesson3\\src\\fileHandling//testFile1.txt");
////  
//		// Create the file
//		if (file.createNewFile()) {
//			System.out.println("File is created!");
//		} else {
//			System.out.println("File already exists.");
//		}
//
//		// Write Content
//		FileWriter writer = new FileWriter(file);
//		writer.write("Writing data in already created file");
//		writer.close();
//	}

	private static void createFileUsingFileOutputStreamClass() throws IOException {
		String data = "Test data" + ", for the second file ";
		FileOutputStream out = new FileOutputStream(
				"D:\\\\Vishal\\\\Full Stack Java Developer\\\\Lesson3\\\\src\\\\fileHandling//testFile2.txt");
		out.write(data.getBytes());
		System.out.println("File created");
		out.close();
	}

	private static void createFileIn_NIO() throws IOException {
		String data = "Test data, for third file";
		Files.write(Paths.get(
				"D:\\\\\\\\Vishal\\\\\\\\Full Stack Java Developer\\\\\\\\Lesson3\\\\\\\\src\\\\\\\\fileHandling//testFile3.txt"),
				data.getBytes());
		List<String> lines = Arrays.asList("1st line", "2nd line");
		Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

	private static void createFileUsingFileClass(String path) throws IOException {
		File file = new File(path);
//  
		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Writing in newly created file");
		writer.close();
	}
}
