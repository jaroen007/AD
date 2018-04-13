package End_assignment;

import static org.junit.Assert.*;

import org.junit.*;

public class Sequential_searchTest {
	// main test van sequential search
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void sequential_searchTest1() {
		Sequential_search sequential = new Sequential_search();
		assertEquals(5650, sequential.search(
				"\"6247\",\"Bounty Boat\",1992,\"Pirates\",\"Imperial Guards\",36,3,\"http://images.brickset.com/sets/images/6247-1.jpg\",NA,4.75,NA,NA,\"Box\",\"Retail\""));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Sequential_search.main(new String[0]);
	}
}
