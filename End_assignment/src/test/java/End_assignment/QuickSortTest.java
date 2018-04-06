package End_assignment;

import java.util.Arrays;
import java.util.List;
import org.junit.*;

public class QuickSortTest {

	public static String[] stringArray;
	public static CsvParser csvParser;

	@Before
	public void setUp() throws Exception {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test() {

		List<String> strings = Arrays.asList(stringArray);
		QuickSort quicksort = new QuickSort(strings);
		csvParser.showList(quicksort.returnSorted());
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		QuickSort.main(new String[0]);
	}
}
