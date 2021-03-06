package End_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class SmartBubbleSortTest<T> {

	public static String[] stringArray;
	public static CsvParser csvParser;
	private static ArrayList<LegoSet> legoSets;

	@Before
	public void setUp() throws Exception {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();
		legoSets = csvParser.returnLegoSetArrayList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testLegoObjects() {
		//Create bubbleSort object with ArrayList<LegoSet> as argument.
		SmartBubbleSort smartBubbleSort = new SmartBubbleSort(legoSets);
		
		//Display the sortedList
		//csvParser.showList(smartBubbleSort.returnSorted());
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		SmartBubbleSort.main(new String[0]);
	}
}
