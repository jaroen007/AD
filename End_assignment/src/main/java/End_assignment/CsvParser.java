package End_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CsvParser {

	private String[] legoArray;
	private ArrayList<LegoSet> legoSets;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CsvParser parser = new CsvParser();
		
	};

	@SuppressWarnings("resource")
	public CsvParser() {
		legoSets = new ArrayList<LegoSet>();

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
					
					String[] lineSplit = line.split(",");
					legoSets.add(new LegoSet(lineSplit[0],lineSplit[1],lineSplit[2],lineSplit[3],lineSplit[4],lineSplit[5],lineSplit[6],lineSplit[7],lineSplit[8],lineSplit[9],lineSplit[10],lineSplit[11],lineSplit[12], lineSplit[13]));
					
					
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

	public ArrayList<LegoSet> returnLegoSetArrayList() {
		return legoSets;
	}
	
	public String[] returnStringArray() {
		return legoArray;
	}

	@SuppressWarnings("rawtypes")
	public void showList(List list) {
		//function used to print a given list.
		
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
		}
		
	}

}
