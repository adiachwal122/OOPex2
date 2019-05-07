package partC;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/**
 * generic two-way linked list Double
 * using generic class NodeDouble 
 * contains anonymous inner class which represents iterator for forward and backward
 * @author user
 * arguments - head, tail, public size for unit testing
 * @param <T>
 */
public class LinkedListDouble<T> {

	private NodeDouble<T> head;
	private NodeDouble<T> tail;
	public int size;

	/**
	 * Default constructor
	 */
	public LinkedListDouble() {
		this.tail = null;
		this.head = null;
		this.size = 0;
	}
	/**
	 * checks for the right place to add NodeDouble
	 * update size 
	 * @param item
	 */
	public void add(T item) {
		NodeDouble<T> temp = new NodeDouble<>(item);
		if (head == null) {
			head = temp;
			tail = head;
		} 
		else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
		size++;
	}
	/**
	 * prints all elements from LinkedListDouble using NodeDouble
	 * prints Empty if LinkedListDouble is null
	 */
	@Override
	public String toString() {
		String ans = "";
		NodeDouble<T> current = head;
		if (size > 0) {
			while (current != null && current != tail) {
				ans += current.data + "";
				current = current.next;
			}
			if(tail == null)
				return ans;
			return ans + tail.data;
		}
		else {
			return "Empty";
		}
	}
	/**
	 * Implements iterator for LinkedListDouble as asked using NodeDouble head and tail 
	 * @return generic ListIterator
	 */
	public ListIterator<T> listIterator(){
		return new ListIterator<T>(){
			NodeDouble<T> current;
			NodeDouble<T> currentTail;
			{
				current = head;
				currentTail = tail;
			}
			/**
			 * returns the next element in LinkedListDouble and advances the cursor position
			 * Throws NoSuchElementException - if the iteration has no next element using function hasNext
			 */
			public T next() {
				if(hasNext()) {
					T temp = current.data;
					current = current.next;
					return temp;
				}
				throw new NoSuchElementException();
			}
			/**
			 * Returns true if this list iterator has more elements when traversing the LinkedListDouble in the forward direction.
			 */
			@Override
			public boolean hasNext() {
				return current != null;
			}

			/**
			 * Returns the previous element in the list and moves the cursor position backwards using hasPrevious function.
			 * Throws NoSuchElementException - if the iteration has no previous element
			 */
			@Override
			public T previous() {
				if(hasPrevious()) {
					T temp = currentTail.data;
					currentTail = currentTail.prev;
					return temp;
				}
				throw new NoSuchElementException();
			}

			/**
			 * Returns true if this list iterator has more elements when traversing the LinkedListDouble in the reverse direction.
			 */

			@Override
			public boolean hasPrevious() {
				return currentTail != null;
			}

			@Override
			public void add(T e) {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}

			@Override
			public int nextIndex() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}

			@Override
			public int previousIndex() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}

			@Override
			public void set(T e) {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}

		};
	}

	/**
	 * class for generic NodeDouble for arguments for LinkedListDouble
	 * @author user
	 *
	 * @param <T>
	 */
	private class NodeDouble<T>{
		NodeDouble<T> next;
		NodeDouble<T> prev;
		private T data;

		/**
		 * constructor
		 * @param data
		 */
		public NodeDouble(T data) {
			this.data = data;
		}
		/**
		 * prints NodeDouble
		 */
		@Override
		public String toString() {
			return "Node{" + "next=" + next + ", prev=" + prev + ", data=" + data +'}';
		}
	}

/*	public static void main(String[] args) {
		LinkedListDouble<String> test = new LinkedListDouble<>();
		test.add("a");
		test.add("b");
		test.add("c");
		test.add("d");
		test.add("e");
		System.out.println(test.toString());
		ListIterator<String> iter1 = test.listIterator();
		while (iter1.hasPrevious()){
			System.out.print(iter1.previous());
		}

	}*/

}
