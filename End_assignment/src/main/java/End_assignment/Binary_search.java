package End_assignment;

import java.util.Arrays;
import java.util.List;

public class Binary_search<T extends Comparable<T>> {
	public List<T> strings;

	public Binary_search(List<T> strings) {
		this.strings = strings;
	}

	// main functie om de Ant build blij te maken
	public static void main(String[] args) {
	}
	
	public int search(T key) {
		// quicksort omdat de binary search een gesorteerde lijst nodig heeft;
		QuickSort quickSort = new QuickSort(strings);
		strings = quickSort.returnSorted();
		return binarySearch(key, 0, strings.size());
	}

	public int binarySearch(T searchText, int low, int high) {
		// bovenste en onderste waarden waartussen gezocht moet worden
		// als de onderste waarde boven de bovenste waarde komt dan ligt het midden boven de bovenste waarde
		// dit betekent dat het buiten de index valt wat niet mogelijk is
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
<<<<<<< HEAD

=======
>>>>>>> bcad5a8becc667678f03d4018e618b5a98c54a67
}