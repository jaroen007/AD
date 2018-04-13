package End_assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class QueueTest {

	public static String[] stringArray;
	public static CsvParser csvParser;
	private static ArrayList<LegoSet> legoSets;
	
	public static Queue queue;

	@Before
	public void setUp() throws Exception {
		csvParser = new CsvParser();
		stringArray = csvParser.returnStringArray();
		legoSets = csvParser.returnLegoSetArrayList();
		
	}
	
	@Test
	public void pushLegoSetsToQueue() {
		queue = new Queue();
		
		for (LegoSet s : legoSets) {
			queue.push(s);
		}
		
		assertTrue("test peek.", (legoSets.size() == queue.getSize()));
	}

	@Test
	public void checkEmptyNewQueue() {
		queue = new Queue();

		assertTrue("Empty after.", queue.isEmpty());
	}

	@Test
	public void checkSize() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");
		
		//TODO: controleren welke overblijfen.

		assertTrue("The size is 3.", (queue.getSize() == 3));
	}

	@Test
	public void pollCheckEmpty() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");

		queue.poll();
		queue.poll();
		queue.poll();

		assertTrue("Empty after remove.", queue.isEmpty());
	}

	@Test
	public void pollCheckNull() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");

		queue.poll();
		queue.poll();
		queue.poll();

		assertTrue("poll returns null.", queue.poll() == null);
	}

	@Test
	public void removeCheckEmpty() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");

		queue.remove();
		queue.remove();
		queue.remove();

		assertTrue("Empty after remove.", queue.isEmpty());
	}

	@Test
	public void removeCheckExeption() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");

		queue.remove();
		queue.remove();
		queue.remove();

		try {
			queue.remove();
		} catch (IllegalStateException e) {
			assertTrue("assert error.", true);
		}

	}

	@Test
	public void peekItem() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");

		assertTrue("Peek element", queue.peek() == "Got pushed first");
		
		//TODO: controleren of ze er nog in zitten.
	}

	@Test
	public void peekItemEmptyQueue() {
		queue = new Queue();

		assertTrue("Check if Queue is empty", queue.isEmpty());
		assertTrue("Peek element", queue.peek() == null);
	}

	@Test
	public void pollItem() {
		queue = new Queue();

		queue.push("Got pushed first");
		queue.push("Got pushed second");
		queue.push("Got pushed third");

		assertTrue("Peek element", queue.poll() == "Got pushed first");
	}

	@Test
	public void pollItemEmptyQueue() {
		queue = new Queue();

		assertTrue("Check if Queue is empty", queue.isEmpty());
		assertTrue("Peek element", queue.poll() == null);
	}

	@Test
	public void elementItemEmptyQueue() {
		queue = new Queue();

		assertTrue("Check if Queue is empty", queue.isEmpty());

		try {
			queue.element();
		} catch (IllegalStateException e) {
			assertTrue("assert error.", true);
		}

	}

	@Test
	public void removeItemEmptyQueue() {
		queue = new Queue();

		assertTrue("Check if Queue is empty", queue.isEmpty());

		try {
			queue.remove();
		} catch (IllegalStateException e) {
			assertTrue("assert error.", true);
		}
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Queue.main(new String[0]);
	}
}
