package End_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CsvParser {

	private String[] legoArray;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CsvParser parser = new CsvParser();
	};

	@SuppressWarnings("resource")
	public CsvParser() {

		String csvFile = (String) (System.getProperty("user.dir") + File.separator + "legosets.csv");
		BufferedReader br = null;
		String line = "";
		try {

			int counter = -1;

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				counter++;
			}
			legoArray = new String[counter];

			int size = counter;
			counter = -1;

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				if (counter < 0) {
				} else if (counter < size) {
					legoArray[counter] = line;
				}
				counter++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found! Put the file at " + System.getProperty("user.dir") + "\\legosets.csv");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String[] returnStringArray() {
		return legoArray;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void showList(List list) {
		/*
		ListIterator<String> litr = list.listIterator();

		while (litr.hasNext()) {
			//System.out.println(litr.next());
		}
		*/
	}

}
