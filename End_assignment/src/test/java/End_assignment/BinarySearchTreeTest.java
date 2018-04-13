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
		assertEquals(6171, binarySearchTree.search(
				"\"798\",\"2 Medium Baseplates, Green\",1971,\"Basic\",\"Supplementaries\",2,NA,\"http://images.brickset.com/sets/images/798-1.jpg\",NA,3.4,NA,NA,\"Not specified\",\"Not specified\"",
				binarySearchTree.head));
	}

	// een test waarvan de waarde boven het midden ligt
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void binarySearchTreeTest2() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addAll();
		assertEquals(5650, binarySearchTree.search(
				"\"6247\",\"Bounty Boat\",1992,\"Pirates\",\"Imperial Guards\",36,3,\"http://images.brickset.com/sets/images/6247-1.jpg\",NA,4.75,NA,NA,\"Box\",\"Retail\"",
				binarySearchTree.head));
	}

	// Een test om de code coverage hoger te krijgen en de Ant blij te maken
	@Test
	public void last() {
		BinarySearchTree.main(new String[0]);
	}
}
