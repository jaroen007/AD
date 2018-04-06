package End_assignment;

import java.util.Arrays;
import java.util.List;

public class Sequential_search<T extends Comparable<T>> {
	public List<T> stringArray;
	public List<String> strings;
	public static CsvParser csvParser;
	
	public Sequential_search() {
	}
	
	// main om de Ant vrolijk te maken
	public static void main(String[] args) {
	}
	
	
	@SuppressWarnings("unchecked")
	public boolean search(T key) {
		// nieuwe csvParser voor csv naar list
		csvParser = new CsvParser();
		strings = Arrays.asList(csvParser.returnStringArray());
		
		// loop door de hele lijst van strings
		for (int i = 0; i < strings.size(); i++) {
			// als de waarde van het huidige item gelijk is aan text return
			if (key.compareTo((T)strings.get(i)) == 0) {
				return true;
			}
		}
		return false;
	}
}