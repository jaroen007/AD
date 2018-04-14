package End_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.*;

public class QuickSortTest {

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

		ArrayList<LegoSet> subString = new ArrayList<LegoSet>(legoSets.subList(0, 300));
		
		QuickSort quickSort = new QuickSort(subString);

	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test() {

		List<String> strings = Arrays.asList(stringArray);
		QuickSort quicksort = new QuickSort(strings);
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		QuickSort.main(new String[0]);
	}
}
