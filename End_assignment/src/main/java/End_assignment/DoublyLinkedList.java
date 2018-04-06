package End_assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings({ "unused", "unchecked", "hiding" })
public class DoublyLinkedList<T> implements List<T> {

	// Class Node is used to store the data and to store the next node in the list
	private class Node {
		public T data; // Used to store the data

		public Node next; // Used to store a reference to the next node
		public Node pref; // Used to store a reference to the next node

		// Constructor for node
		public Node(T data) {
			this.data = data; // Set data
			this.next = null; // next is default 0
			this.pref = null; // next is default 0
		}

		// Overloaded constructor for node that also sets next
		public Node(T data, Node next) {
			this.data = data; // set data
			this.next = next; // set next
			this.pref = null; // next is default 0
		}

		// Overloaded constructor for node that also sets next and pref
		public Node(T data, Node next, Node pref) {
			this.data = data; // set data
			this.next = next; // set next
			this.pref = pref; // set pref
		}

		// Returns data toString
		public String toString() {
			return "Node(" + data.toString() + ")";
		}
	}

	private int size; // keeps track of the number of elements
	private Node head; // reference to the first node

	// main functie om de Ant build blij te maken
	public static void main(String[] args) {
	}

	// Constructor for DoublyLinkedList
	public DoublyLinkedList() {
		head = null; // Default null
		size = 0; // And default empty
	}

	// Override list method add for adding data to the list (at the end of the list)
	public boolean add(T data) {
		if (head == null) { // if there is no head its the first element to be added to the list
			head = new Node(data); // set the head to the given data.
		} else {

			Node currentNode = head; // Set the currentNode on the first node.

			// Loop trough all nodes by finding the next one till there is no next one.
			// (and set currentNode along the way)
			for (; currentNode.next != null; currentNode = currentNode.next) {
			}

			// Last node is found, so put the new node after the found node.
			currentNode.next = new Node(data);
		}

		size++; // One got added so increase the size.
		return true;
	}

	public void add(int index, T data) {
		if (index == 0) { // If you want to replace the first, the head needs to be on the new element.

			// The old head is the link! (the head gets replaced)
			head = new Node(data, head);

		} else {
			// Get the node located before the one you want to insert
			Node nodeBevoreInsert = getNode(index - 1);

			// The node located before the one you want to insert needs to have the new node
			// as next node.
			// The new node needs to have the current next node as his next node.
			nodeBevoreInsert.next = new Node(data, nodeBevoreInsert.next);
		}

		size++; // One got added so increase the size.
	}

	// Inserts all of the elements in the collection.
	public boolean addAll(Collection<? extends T> collection) {
		boolean flag = true; // Flag to return starts on true
		for (T element : collection) { // Loop trough given collection
			flag &= add(element); // flag becomes false if the adding fails
			// (true + false = false)
		}
		return flag;// return the flag
	}

	public boolean addAll(int index, Collection<? extends T> collection) {
		throw new UnsupportedOperationException();
	}

	// Used to clear the list
	public void clear() {
		head.next.pref = null; // Set the reference back to the head on null
		head = null; // Set the head on null

		size = 0; // Set the size on null
	}

	public boolean contains(Object obj) {
		return indexOf(obj) != -1; // Checks if the object is found, else return -1
	}

	// Used to check if the whole given collection is in this collection
	public boolean containsAll(Collection<?> collection) {
		// Loop trough given collection
		for (Object obj : collection) {
			if (!contains(obj)) {
				return false; // If it doens't contain the value return false
			}
		}

		// If you are here the whole loop is done so return true
		return true;
	}

	// Get the data of the node on the given index.
	public T get(int index) {
		Node node = getNode(index); // Get the data from the node.
		return node.data;
	}

	// Get the node on a specific index
	private Node getNode(int index) {

		// If a negative index is given or an index same or bigger then size throw an
		// exception.
		if (index < 0 || index >= size) { // (humans start to count at 1!)
			throw new IndexOutOfBoundsException();
		}
		// Set the node on head.
		Node node = head;
		// loop trough the nodes till the index is reached.
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		// Return the node.
		return node;
	}

	// returns the index of the object given.
	// if the object does not exist return -1
	public int indexOf(Object target) {
		Node currentNode = head; // Start at the head.
		for (int i = 0; i < size; i++) { // Loop through.
			if (equals(target, currentNode.data)) { // If the target is the same as the data from the node.
				return i; // return i
			}
			currentNode = currentNode.next; // Go to next node in the list!
		}
		return -1;
	}

	// Function to check if the given objects are equal.
	// used in indexOf() and lastIndexOf()
	private boolean equals(Object target, Object element) {
		if (target == null) {
			return element == null;
		} else {
			return target.equals(element);
		}
	}

	// Checks if size is 0 (if its zero the list is empty)
	public boolean isEmpty() {
		return size == 0;
	}

	public Iterator<T> iterator() {
		T[] array = (T[]) toArray();
		return Arrays.asList(array).iterator();
	}

	// returns the index of the object given.
	// Returns the last index found. (keeps looping although something is found)
	public int lastIndexOf(Object target) {
		Node node = head;
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (equals(target, node.data)) {
				index = i;
			}
			node = node.next;
		}
		return index;
	}

	public ListIterator<T> listIterator() {
		return null; // Not implemented
	}

	public ListIterator<T> listIterator(int index) {
		return null; // Not implemented
	}

	// Removes an given object
	public boolean remove(Object obj) {
		int index = indexOf(obj); // Get the index of the object!
		if (index == -1) { // indexOf returns -1 if its not found
			return false;
		}
		remove(index); // Remove the object at the found index
		return true;
	}

	// getSize() is the same as size()
	public int getSize() {
		return size();
	}

	// removes a item at the given index
	public T remove(int index) {

		T data = get(index); // Get the node

		if (index == 0) { // If the removed index is 0 ...
			head = head.next; // ..the head needs to get replaced.
		} else {
			Node prev = getNode(index - 1); // Get the previous node.
			prev.next = prev.next.next; // Link that node to next next node.
										// The one skipped is removed!
		}
		size--;
		return data;
	}

	// Removes all items in the list that also
	public boolean removeAll(Collection<?> collection) {
		boolean flag = true; // Set the flag on true
		for (Object obj : collection) { // Loop trough given collection
			flag &= remove(obj); // flag becomes false if the removing fails
			// (true + false = false)
		}
		return flag;
	}

	public boolean retainAll(Collection<?> collection) {
		throw new UnsupportedOperationException();
		// not supported!
	}

	// Set given element on the index.
	public T set(int index, T element) {
		Node node = getNode(index); // Get the item currently on the index.
		T old = node.data; // Get the value of the old index.
		node.data = element; // Replace the data of the index.
		return old; // And return the old index.
	}

	// returns the size of the linked list.
	public int size() {
		return size;
	}

	public List<T> subList(int fromIndex, int toIndex) {
		if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
			throw new IndexOutOfBoundsException();
		}

		// Create a new list.
		LinkedList<T> returnList = new LinkedList<T>();

		// Loop from fromIndex to toIndex
		for (int i = fromIndex; i < toIndex; i++) {
			// Add the data of the object to the list
			returnList.add(get(i));
		}

		return returnList;
	}

	// Turns the whole list into an array
	public Object[] toArray() {
		Object[] array = new Object[size]; // make a new Object array
		int i = 0; // Set the needle on 0
		for (Node node = head; node != null; node = node.next) {
			array[i] = node.data; // Loop trough the nodes and add them to the array.
			i++;
		}
		return array;
	}

	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
		// Not supported
	}
}
