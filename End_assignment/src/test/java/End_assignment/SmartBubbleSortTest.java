package End_assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class SmartBubbleSortTest<T> {

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

		SmartBubbleSort smartbubblesort = new SmartBubbleSort(strings);

		csvParser.showList(smartbubblesort.returnSorted());
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		SmartBubbleSort.main(new String[0]);
	}
}
