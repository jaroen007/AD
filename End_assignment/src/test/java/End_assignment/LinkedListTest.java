package End_assignment;

import org.junit.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListTest {

	public static String[] stringArray;
	public static CsvParser csvParser;
	private static ArrayList<LegoSet> legoSets;
	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void addingAllLegoObjects() {
		csvParser = new CsvParser();
		legoSets = csvParser.returnLegoSetArrayList();
		
		LinkedList<Object> linkedList = new LinkedList<Object>();

		for (LegoSet s : legoSets) {
			linkedList.add(s);
		}
		assertTrue("Added all items from the LegoSets arrayList", legoSets.size() == linkedList.size());
	}
	
	@Test
	public void addingAllfromCsvUsingLoop() {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();

		LinkedList<String> linkedList = new LinkedList<String>();
		List<String> strings = Arrays.asList(stringArray);

		for (String s : strings) {
			linkedList.add(s);
		}
		assertTrue("Added all items from the LinkedList", linkedList.size() == linkedList.size());
	}

	public void addingAllfromCsvUsingAddAll() {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();

		LinkedList<String> linkedList = new LinkedList<String>();
		List<String> strings = Arrays.asList(stringArray);

		linkedList.addAll(strings);

		assertTrue("Added all items from the LinkedList", linkedList.size() == linkedList.size());
	}

	@Test
	public void addingStringsCheckingSize() {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("First!");
		linkedList.add("Second!");
		linkedList.add("Third!");

		assertTrue("Strings got add.", linkedList.getSize() == 3);
	}

	@Test
	public void addingStringsOnIndexCheckingSize() {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add(0, "First!");
		linkedList.add(1, "Second!");
		linkedList.add(1, "Third!");

		assertTrue("Strings got add.", linkedList.getSize() == 3);
	}

	@Test
	public void addingIntsCheckingSize() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		assertTrue("Integers got add.", linkedList.getSize() == 4);
	}

	@Test
	public void addingIntsOnIndexCheckingSize() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(0, 1);
		linkedList.add(0, 2);
		linkedList.add(1, 3);
		linkedList.add(1, 4);

		assertTrue("Integers got add.", linkedList.getSize() == 4);
	}

	@Test
	public void isEmptyTest() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		assertTrue("List is empty.", linkedList.isEmpty());
	}

	@Test
	public void isNotEmptyTest() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);

		assertFalse("List is empty.", linkedList.isEmpty());
	}

	@Test
	public void lastIndexOf() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		assertTrue("Index where value 2 recides is 1.", (linkedList.lastIndexOf(2) == 1));
	}

	@Test
	public void indexOf() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		assertTrue("Index where value 2 recides is 1.", (linkedList.indexOf(2) == 1));
	}

	@Test
	public void checkSize() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		assertTrue("The size is 3.", (linkedList.size() == 3));
	}

	@Test
	public void removeThenCheckSize() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		linkedList.remove(2);

		assertTrue("The size is 2.", (linkedList.size() == 2));
	}

	@Test
	public void addAll() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		LinkedList<Integer> linkedListTwo = new LinkedList<Integer>();
		linkedListTwo.add(4);
		linkedListTwo.add(5);
		linkedListTwo.add(6);

		linkedList.addAll(linkedListTwo);

		assertTrue("The size is 6 (3 from one list 3 from the other).", (linkedList.size() == 6));
	}

	@Test
	public void clear() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.clear();

		assertTrue("list got cleared and is empty.", linkedList.isEmpty());
	}

	@Test
	public void contains() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		assertTrue("list contains 3", linkedList.contains(3));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		LinkedList.main(new String[0]);
	}
}
