package End_assignment;

import java.util.Arrays;
import java.util.List;

public class Binary_search<T extends Comparable<T>> {
	public List<String> strings;
	public static CsvParser csvParser;

	public Binary_search() {
	}

	// main functie om de Ant build blij te maken
	public static void main(String[] args) {
	}

	@SuppressWarnings({ "unchecked", "rawtypes", })
	public int search(T key) {
		// Gebruik de csvParser() om de csv om te zetten in list
		csvParser = new CsvParser();
		// krijg de lijst met strings
		strings = Arrays.asList(csvParser.returnStringArray());
		// quicksort omdat de binary search een gesorteerde lijst nodig heeft;
		QuickSort quickSort = new QuickSort(strings);
		strings = quickSort.returnSorted();
		return binarySearch(key, 0, strings.size());
	}

	@SuppressWarnings("unchecked")
	public int binarySearch(T searchText, int low, int high) {
		// bovenste en onderste waarden waartussen gezocht moet worden
		if (low > high) {
			low = 0;
			high = strings.size();
		}
		int middle = (high + low) / 2;

		// compare text met de waarden
		// als de text groter is komt er -1 terug
		// als de text kleiner is komt er -1 terug
		// als de text hetzelfde is komt er 0 terug
		// gebruik een recursive functie
		if (searchText.compareTo((T) strings.get(middle)) == 0) {
			return strings.indexOf(strings.get(middle));
		} else if (searchText.compareTo((T) strings.get(middle)) < 0) {
			return binarySearch(searchText, low, middle - 1);
		} else if (searchText.compareTo((T) strings.get(middle)) > 0) {
			return binarySearch(searchText, middle + 1, high);
		}
		return -1;
	}

}