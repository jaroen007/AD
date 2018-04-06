package End_assignment;

import java.util.Arrays;
import java.util.List;
import org.junit.*;

public class InsertionSortTest {
	//initialize Array and csvParser
	public static String[] stringArray;
	public static CsvParser csvParser;

	@Before
	public void setUp() throws Exception {
		//use csvParser() om csvparser om te zetten naar list.
		//vul stringArray met waardes uit csvParser
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();
	}

	@Test
	public void test() {

		List<String> strings = Arrays.asList(stringArray);
		//voer de sort uit
		@SuppressWarnings({ "rawtypes", "unchecked" })
		InsertionSort insertsort = new InsertionSort(strings);
		
		csvParser.showList(insertsort.returnSorted());
		
	}
	
	@Test
	public void test2() {
		InsertionSort.main(new String[0]); 
	}

}
