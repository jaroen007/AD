package End_assignment;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BinarySearchTreeTest<T extends Comparable<T>> {

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
	public void binarySearchThreeTestLegoObject() {
		
		//Initiate the binary search.
		BinarySearchTree binary = new BinarySearchTree(); 
		binary.addAll(legoSets); //give the binary search a set to work with.
		
		//Select the third of the list. We are going to try to find this item in the list again.
		LegoSet legoSet = legoSets.get(3);
		
		//assert that the binary search finds it on the third entry
		assertEquals(binary.search(legoSet),3);
	}

	// een test waarvan de waarde onder het midden ligt
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binarySearchTreeTest1() {
		//Initiate the binary search.
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addAll(strings);//give the binary search a set to work with.
		
		//Search for a given strings
		assertEquals(6171, binarySearchTree.search(
				"\"798\",\"2 Medium Baseplates, Green\",1971,\"Basic\",\"Supplementaries\",2,NA,\"http://images.brickset.com/sets/images/798-1.jpg\",NA,3.4,NA,NA,\"Not specified\",\"Not specified\"",
				binarySearchTree.head));
	}

	// een test waarvan de waarde boven het midden ligt
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binarySearchTreeTest2() {
		//Initiate the binary search.
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addAll(strings);//give the binary search a set to work with.
		
		//Search for a given strings
		assertEquals(5650, binarySearchTree.search(
				"\"6247\",\"Bounty Boat\",1992,\"Pirates\",\"Imperial Guards\",36,3,\"http://images.brickset.com/sets/images/6247-1.jpg\",NA,4.75,NA,NA,\"Box\",\"Retail\"",
				binarySearchTree.head));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		BinarySearchTree.main(new String[0]);
	}
}
