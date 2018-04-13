package End_assignment;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {
	// node class met extra variabelen
	private class Node {
		public T data;
		public Node left;
		public Node right;

		public Node(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	// alle variabelen die nodig zijn
	public Node head;
	private int size;
	public List<T> strings;
	public static CsvParser csvParser;
	
	public BinarySearchTree(List<T> strings) {
		head = null;
		size = 0;
		this.strings = strings;
	}
	
	// main om de Ant build blij te maken
	public static void main(String[] args) {
		
	}
	
	// recursive functie om een node toe te voegen
	public boolean addNode(T element, Node root) {
		// als er geen head is zet het element op de eerste node
		if (head == null) {
			head = new Node(element);
			size++;
			return true;
		}
		Node node = root;
		
		// als de text groter is komt er -1 terug
		// als de text kleiner is komt er -1 terug
		// als er links of rechts geen node staat, voeg hem dan op die plek toe
		// gebruik een recursive functie
		if (element.compareTo(node.data) < 0) {
			if (node.left == null) {
				node.left = new Node(element);
				size++;
				return true;
			}
			return addNode(element, node.left);
		} else if (element.compareTo(node.data) > 0) {
			if (node.right == null) {
				node.right = new Node(element);
				size++;
				return true;
			}
			return addNode(element, node.right);
		}
		return false;
	}
	
	// voeg alle item uit de string array toe aan de Tree
	public boolean addAll() {
		try {
			for (T string : strings) {
				addNode((T)string, head);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	// de zoek fucntie
	public int search(T element, Node root) {
		Node node = root;
		// compare text met de waarden
		// als de text groter is komt er -1 terug
		// als de text kleiner is komt er -1 terug
		// als de text hetzelfde is komt er 0 terug
		// gebruik een recursive functie
		if (element.compareTo(node.data) == 0) {
			return strings.indexOf(element);
	 	} else if (element.compareTo(node.data) < 0) {
			return search(element, node.left);
		} else if (element.compareTo(node.data) > 0) {
			return search(element, node.right);
		}
		return -1;
	}
}