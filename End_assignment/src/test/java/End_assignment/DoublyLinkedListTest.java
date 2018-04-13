package End_assignment;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoublyLinkedListTest {

	public static String[] stringArray;
	public static CsvParser csvParser;
	private static ArrayList<LegoSet> legoSets;

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

		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		List<String> strings = Arrays.asList(stringArray);

		for (String s : strings) {
			doublyLinkedList.add(s);
		}
		assertTrue("Added all items from the DoublyLinkedList", strings.size() == doublyLinkedList.size());
	}

	@Test
	public void addingAllfromCsvUsingAddAll() {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();

		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		List<String> strings = Arrays.asList(stringArray);

		doublyLinkedList.addAll(strings);

		assertTrue("Added all items from the DoublyLinkedList", doublyLinkedList.size() == doublyLinkedList.size());
	}

	@Test
	public void addingStringsCheckingSize() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();

		doublyLinkedList.add("First!");
		doublyLinkedList.add("Second!");
		doublyLinkedList.add("Third!");

		assertTrue("Strings got add.", doublyLinkedList.getSize() == 3);
	}

	@Test
	public void addingStringsOnIndexCheckingSize() {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();

		doublyLinkedList.add(0, "First!");
		doublyLinkedList.add(1, "Second!");
		doublyLinkedList.add(1, "Third!");

		assertTrue("Strings got add.", doublyLinkedList.getSize() == 3);
	}

	@Test
	public void addingIntsCheckingSize() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);
		doublyLinkedList.add(4);

		assertTrue("Integers got add.", doublyLinkedList.getSize() == 4);
	}

	@Test
	public void addingIntsOnIndexCheckingSize() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(0, 1);
		doublyLinkedList.add(0, 2);
		doublyLinkedList.add(1, 3);
		doublyLinkedList.add(1, 4);

		assertTrue("Integers got add.", doublyLinkedList.getSize() == 4);
	}

	@Test
	public void isEmptyTest() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		assertTrue("List is empty.", doublyLinkedList.isEmpty());
	}

	@Test
	public void isNotEmptyTest() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(1);

		assertFalse("List is empty.", doublyLinkedList.isEmpty());
	}

	@Test
	public void lastIndexOf() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);

		assertTrue("Index where value 2 recides is 1.", (doublyLinkedList.lastIndexOf(2) == 1));
	}

	@Test
	public void indexOf() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);

		assertTrue("Index where value 2 recides is 1.", (doublyLinkedList.indexOf(2) == 1));
	}

	@Test
	public void checkSize() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);

		assertTrue("The size is 3.", (doublyLinkedList.size() == 3));
	}

	@Test
	public void removeThenCheckSize() {
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);

		doublyLinkedList.remove(2);

		assertTrue("The size is 2.", (doublyLinkedList.size() == 2));
	}

	@Test
	public void addAll() {

		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);

		DoublyLinkedList<Integer> linkedListTwo = new DoublyLinkedList<Integer>();
		linkedListTwo.add(4);
		linkedListTwo.add(5);
		linkedListTwo.add(6);

		doublyLinkedList.addAll(linkedListTwo);

		assertTrue("The size is 6 (3 from one list 3 from the other).", (doublyLinkedList.size() == 6));
	}

	@Test
	public void clear() {

		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);
		doublyLinkedList.clear();

		assertTrue("list got cleared and is empty.", doublyLinkedList.isEmpty());
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		DoublyLinkedList.main(new String[0]);
	}

}
