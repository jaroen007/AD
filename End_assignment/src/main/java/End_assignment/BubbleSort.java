package End_assignment;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> {
	
	//main om de ant vrolijk te maken.
	public static void main(String[] args) {
		 
	}
	
	//create generic list t to put all unsorted things in.
	 public List<T> sortedList; 
	
	 public BubbleSort( List<T> legoArray) {
		sortedList = legoArray; //fill sorted list with all the unsorted things.
		
	 	int n = sortedList.size();    
	 	
        for(int i=0; i < n; i++){  //loop through all items

             for(int j=1; j < (n-i); j++){ //create another loop to begin the check at the left side.
            	//call compareTo to start the check returning the indexOf. -1 = last one lower (do nothing), 0 = even, > 0 = last one higher (so swap)
            	 
            	 if(sortedList.get(j-1).compareTo(sortedList.get(j)) > 0){  
                	 swap(j-1, j); //swap the values. 
                 }  
             }  
         }  
	 }
	 
	 
	 void swap(int i, int j) {
        T temp = sortedList.get(i); //get old, store in temp
        
        sortedList.set(i, sortedList.get(j)); //swap values
        sortedList.set(j, temp); //override temp
     }
	 
	 public List<T> returnSorted() {
		 return sortedList; //return sorted list
	 }
	 
}
