package End_assignment;

import java.util.List;

public class InsertionSort<T extends Comparable<T>> {
	
	//initialiseer list and fields
	public List<T> names;
	
	//main om de ant vrolijk te maken.
	public static void main(String[] args) {
		 
	}
	//constructor
	public InsertionSort(List<T> list) {		
		names = list;
		
		//loop door list en swap names
		for (int i = 0; i < names.size(); i++) {
			for (int j = 0; j < names.size()-1; j++) {
				if (names.get(i).compareTo(names.get(j)) < 0) {
					exchangeNames(i,j);
				} 
			}
		}
	}
	
	//return de list
	public List<T> returnSorted() {

		return names;
	}
	
	//swap de names in de list
	void exchangeNames(int i, int j) {
		T temp = names.get(j);

		names.set(j, names.get(i));
		names.set(i, temp);
	}
}