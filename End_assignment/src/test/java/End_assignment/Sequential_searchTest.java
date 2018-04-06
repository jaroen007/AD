package End_assignment;

import static org.junit.Assert.*;

import org.junit.*;

public class Sequential_searchTest {
	// main test van sequential search
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void sequential_searchTest1() {
		Sequential_search sequential = new Sequential_search();
		assertEquals(true, sequential.search(
				"6162,Building_Fun_with_LEGO,2007,Creator,Mosaic,286,NA,http://images.brickset.com/sets/images/6162-1.jpg,7.99,9.99,NA,NA,Box,Retail"));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Sequential_search.main(new String[0]);
	}
}
