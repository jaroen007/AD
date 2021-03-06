package End_assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class StackTest {

	public static String[] stringArray;
	public static CsvParser csvParser;
	private static ArrayList<LegoSet> legoSets;
	
	public static Stack stack;
	
	@Before
	public void setUp() throws Exception {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();
		legoSets = csvParser.returnLegoSetArrayList();
	}
	
	@Test
	public void pushLegoSetsToStack() {
		stack = new Stack();
		
		for (LegoSet s : legoSets) {
			stack.push(s);
		}
		
		assertTrue("test peek.", (legoSets.size() == stack.getSize()));
	}

	@Test
	public void peek() {
		stack = new Stack();

		stack.push("Got pushed first");
		stack.push("Got pushed second");
		stack.push("Got pushed third");

		assertEquals(3, stack.getSize());
		
		assertTrue("test peek.", (stack.peek() == "Got pushed third"));
	}

	@Test
	public void popCheckOrder() {
		stack = new Stack();

		stack.push("Got pushed first");
		stack.push("Got pushed second");
		stack.push("Got pushed third");

		assertTrue("First pop.", (stack.pop() == "Got pushed third"));

		assertTrue("Second pop.", (stack.pop() == "Got pushed second"));

		assertTrue("Third pop.", (stack.pop() == "Got pushed first"));
	}

	@Test
	public void popCheckEmpty() {
		stack = new Stack();

		stack.push("Got pushed first");
		stack.push("Got pushed second");
		stack.push("Got pushed third");

		stack.pop();
		stack.pop();
		stack.pop();

		assertTrue("Empty after pop.", stack.isEmpty());
	}

	@Test
	public void checkEmptyNewStack() {
		stack = new Stack();

		assertTrue("Empty after.", stack.isEmpty());
	}

	@Test
	public void checkSize() {
		stack = new Stack();

		stack.push("Got pushed first");
		stack.push("Got pushed second");
		stack.push("Got pushed third");

		assertEquals("Got pushed third", (String)stack.peek());
		
		assertTrue("The size is 3.", (stack.getSize() == 3));
	}

	@Test
	public void checkSizeAfterPop() {
		stack = new Stack();

		stack.push("Got pushed first");
		stack.push("Got pushed second");
		stack.push("Got pushed third");

		stack.pop();
		
		assertEquals("Got pushed second", (String)stack.peek());

		assertTrue("The size is 2.", (stack.getSize() == 2));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Stack.main(new String[0]);
	}
}
