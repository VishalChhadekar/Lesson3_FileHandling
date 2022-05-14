package lessionThree.FileHandling;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;

//reading the data from file
public class FileReading {

	public static List<String> readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			System.out.println("working fine");
		}

		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception occured");
		}
		return lines;//will return the file
	}

	public static void main(String[] args) {
		List l = readFileInList(
				"D:\\\\Vishal\\\\Full Stack Java Developer\\\\Lesson3\\\\src\\\\fileHandling//testFile3.txt");

		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
