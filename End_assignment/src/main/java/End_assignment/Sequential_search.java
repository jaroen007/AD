package End_assignment;

import java.util.Arrays;
import java.util.List;

public class Sequential_search<T extends Comparable<T>> {
	public List<T> strings;
	public static CsvParser csvParser;
	
	public Sequential_search(List<T> strings) {
		this.strings = strings;
	}
	
	// main om de Ant vrolijk te maken
	public static void main(String[] args) {
	}
	
	
	@SuppressWarnings("unchecked")
	public int search(T key) {		
		// loop door de hele lijst van strings
		for (int i = 0; i < strings.size(); i++) {
			// als de waarde van het huidige item gelijk is aan text return
			if (key.compareTo((T)strings.get(i)) == 0) {
				return strings.indexOf(strings.get(i));
			}
		}
		return -1;
	}
}