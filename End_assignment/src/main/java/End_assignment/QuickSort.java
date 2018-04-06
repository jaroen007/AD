package End_assignment;

import java.util.List;

public class QuickSort<T extends Comparable<T>> {

	// main om de ant vrolijk te maken.
	public static void main(String[] args) {

	}

	public List<T> names;
	public int arrayLength;

	public QuickSort(List<T> givenArray) {
		if (givenArray == null || givenArray.size() == 0) {
			return; // If the given list is empty.
		}

		names = givenArray; // Set the names array
		arrayLength = names.size(); // Set the size

		quickSort(0, arrayLength - 1); // Start the first QuickSort!
	}

	public void quickSort(int start, int end) {

		int i = start; // Set the start (left)
		int k = end; // Set the end (right)
		int pivot = start; // Set the pivot (Check happens left and right of the pivot)

		if (end - start >= 1) { // if to check if there is something for the while to do

			// while the end is bigger then the start.
			// If this is false you checked all the numbers.
			while (k > i) {

				// Compare the start to the pivot. If its less then one increase the left
				// pointer.
				// This checks if the entry on I is at the good side of the pivot.
				while (names.get(i).compareTo(names.get(pivot)) < 0 && i <= end && k > i) {
					i++;
				}

				// Compare the end to the pivot. If its less then more decrease the end pointer.
				// This checks if the entry on I is at the good side of the pivot.
				while (names.get(k).compareTo(names.get(pivot)) > 0 && k >= start && k >= i) {
					k--;
				}

				// if the I is bigger then the K they need to swap sides.
				if (k > i) {
					exchangeNames(i, k);
				}
			}

			// Start the new quicksort on the left side.
			quickSort(start, k - 1);

			// Start the new right on the left side.
			quickSort(k + 1, end);
		} else {
			return;
		}
	}

	// Swaps the values of the given keys.
	void exchangeNames(int i, int j) {
		T temp = names.get(i); // Remember what is in i in temp
		names.set(i, names.get(j)); // Overwrite i with j
		names.set(j, temp); // Overwrite j with the temp
	}

	// Returns the sorted list
	public List<T> returnSorted() {
		return names;
	}
}
