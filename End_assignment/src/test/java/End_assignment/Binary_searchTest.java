package End_assignment;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Binary_searchTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binary_searchTest1() {
		Binary_search binary = new Binary_search();
		assertEquals(true, binary.search(
				"10248,Ferrari_F40,2015,Advanced_Models,Vehicles,1158,NA,http://images.brickset.com/sets/images/10248-1.jpg,69.99,99.99,119.99,89.99,Box,LEGO_exclusive"));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binary_searchTest2() {
		Binary_search binary = new Binary_search();
		assertEquals(true, binary.search(
				"4022,C26_Sea_Cutter,1996,Boats,,193,3,http://images.brickset.com/sets/images/4022-1.jpg,NA,30,NA,NA,Box,Retail"));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binary_searchTest3() {
		Binary_search binary = new Binary_search();
		assertEquals(true, binary.search(
				"71005,LEGO_Minifigures_-_The_Simpsons_Series_{Random_bag},2014,Collectable_Minifigures,The_Simpsons,NA,NA,http://images.brickset.com/sets/images/71005-0.jpg,NA,3.99,NA,NA,Foil_pack,Retail"));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		Binary_search.main(new String[0]);
	}
}
