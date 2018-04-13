package End_assignment;

public class Queue<T> {
	// this stack is based on our own linkedList;\
	public LinkedList<T> linkedList;

	// main om de ant vrolijk te maken.
	public static void main(String[] args) {

	}

	// Constructor for the stack.
	public Queue() {
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

	// Returns the object at the head of the Queue without removing it.
	// Return null if the queue is empty.
	public T peek() {
		if (isEmpty()) { // Returns null if its empty.
			return null;
		}

		// Ask the linked list for the first object in the list.
		return linkedList.get(0); // (Does not remove the object!)
	}

	// Returns the object at the head of the Queue without removing it.
	public T element() {
		if (isEmpty()) { // Throwing IllegalStateException if its empty.
			throw new IllegalStateException();
		}

		// Ask the linked list for the first object in the list.
		return linkedList.get(0); // (Does not remove the object!)
	}

	// Removes and returns the object at the top of the Queue.
	public Object poll() {
		if (isEmpty()) { // Throwing IllegalStateException if its empty.
			return null;
		}

		// Returns null if its empty.
		return linkedList.remove(0);
	}

	// Removes and returns the object at the top of the Queue.
	public Object remove() {
		if (isEmpty()) { // Throwing IllegalStateException if its empty.
			throw new IllegalStateException();
		}

		// Returns null if its empty.
		return linkedList.remove(0);
	}

}
