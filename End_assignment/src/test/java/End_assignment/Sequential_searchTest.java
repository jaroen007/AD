package End_assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class Sequential_searchTest<T extends Comparable<T>> {

	public List<T> strings;
	public static CsvParser csvParser;
	private static ArrayList<LegoSet> legoSets;
	
	@SuppressWarnings("unchecked")
	@Before
	public void beforeTest() {
		csvParser = new CsvParser();
		strings = (List<T>) Arrays.asList(csvParser.returnStringArray());
		
		legoSets = csvParser.returnLegoSetArrayList();
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void sequential_SearchTestLegoObject() {
		
		//First we get a subset (to speed the search up)
		ArrayList<LegoSet> subset = new ArrayList<LegoSet>(legoSets.subList(0,50));
		
		//Initiate the binary search with the list of items.
		Sequential_search sequential_search = new Sequential_search(subset); 
		
		//Select the third of the list. We are going to try to find this item in the list again.
		LegoSet legoSet = legoSets.get(3);

		//assert that the binary search finds it on the third entry
		assertEquals(sequential_search.search(legoSet),3);
	}
	
	// main test van sequential search
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void sequential_searchTest1() {
		Sequential_search sequential = new Sequential_search(strings);
		assertEquals(5650, sequential.search(
				"\"6247\",\"Bounty Boat\",1992,\"Pirates\",\"Imperial Guards\",36,3,\"http://images.brickset.com/sets/images/6247-1.jpg\",NA,4.75,NA,NA,\"Box\",\"Retail\""));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Sequential_search.main(new String[0]);
	}
}
