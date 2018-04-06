package End_assignment;

import static org.junit.Assert.*;
import org.junit.*;

public class BinarySearchTreeTest {

	// een test waarvan de waarde onder het midden ligt
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binarySearchTreeTest1() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addAll();
		assertEquals(true, binarySearchTree.search(
				"10241,Maersk_Line_Triple-E,2014,Advanced_Models,Maersk,1518,NA,http://images.brickset.com/sets/images/10241-1.jpg,109.99,149.99,179.99,129.99,Box,LEGO_exclusive",
				binarySearchTree.head));
	}

	// een test waarvan de waarde boven het midden ligt
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binarySearchTreeTest2() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addAll();
		assertEquals(true, binarySearchTree.search(
				"4153,Freestyle_Playcase_(L),_5+,1995,Freestyle,,687,2,http://images.brickset.com/sets/images/4153-1.jpg,NA,38,NA,NA,Not_specified,Not_specified",
				binarySearchTree.head));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		BinarySearchTree.main(new String[0]);
	}
}
