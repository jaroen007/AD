package End_assignment;

public class Stack<T> {

	// this stack is based on our own linkedList;\
	public LinkedList<T> linkedList;

	// main functie om de Ant build blij te maken
	public static void main(String[] args) {
	}

	// Constructor for the stack.
	public Stack() {
		// Instantiate the linked list this stack uses.
		linkedList = new LinkedList<T>();
	}

	public void push(T element) {
		// Add the element to the linked list.
		linkedList.add(element);
	}

	public int getSize() {
		// get the size of the stack by getting the stack of the linked list.
		return linkedList.size();
	}

	public boolean isEmpty() {
		// check if the stack is empty by checking if the linked list is empty.
		return linkedList.isEmpty();
	}

	public void clear() {
		// Clear the stack by clearing the linked list.
		linkedList.clear();
	}

	// Returns the object at the top of the Stack without removing it.
	public T peek() {
		// Ask the linked list for the last object in the list.
		// (index minus 1 due to starting at 0 and size starts at 1)
		return linkedList.get(linkedList.size() - 1);
	}

	// Removes and returns the object at the top of the Stack.
	public Object pop() {
		// Ask the linked list to remove the last object in the list.
		// (Remove returns the removed item. and index minus 1 due to starting at 0 and
		// size starts at 1)
		return linkedList.remove(linkedList.size() - 1);
	}
}
