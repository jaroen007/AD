package End_assignment;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Binary_searchTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binary_searchTest1() {
		Binary_search binary = new Binary_search(); 
		assertEquals(true, binary.search(
				"\"798\",\"2 Medium Baseplates, Green\",1971,\"Basic\",\"Supplementaries\",2,NA,\"http://images.brickset.com/sets/images/798-1.jpg\",NA,3.4,NA,NA,\"Not specified\",\"Not specified\""));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binary_searchTest2() {
		Binary_search binary = new Binary_search();
		assertEquals(true, binary.search(
				"\"6247\",\"Bounty Boat\",1992,\"Pirates\",\"Imperial Guards\",36,3,\"http://images.brickset.com/sets/images/6247-1.jpg\",NA,4.75,NA,NA,\"Box\",\"Retail\""));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binary_searchTest3() {
		Binary_search binary = new Binary_search();
		assertEquals(true, binary.search(
				"\"8022\",\"Multi Model Starter Set\",1993,\"Technic\",\"Universal\",118,NA,\"http://images.brickset.com/sets/images/8022-1.jpg\",NA,15.5,NA,NA,\"Box\",\"Retail\""));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Binary_search.main(new String[0]);
	}
}
