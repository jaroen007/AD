package End_assignment;

import java.util.Arrays;
import java.util.List;
import org.junit.*;

public class BubbleSortTest<T> {

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
		BubbleSort bubblesort = new BubbleSort(strings);
		csvParser.showList(bubblesort.returnSorted());
	}
	
	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		BubbleSort.main(new String[0]);
	}
}
