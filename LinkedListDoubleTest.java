package partC;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ListIterator;
import org.junit.jupiter.api.Test;
/**
 * checks the correctness of all function in class LinkedListDouble as asked
 * @author user
 */
class LinkedListDoubleTest {
	LinkedListDouble<String> t = new LinkedListDouble<>();

	/**
	 * checks the constructor, size=0 if it works  
	 */
	@Test
	void testLinkedListDouble() {
		assertEquals(0, t.size);
	}
	/**
	 * add elements and using iterator checks the correctness
	 */
	@Test
	void testAdd() {
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		ListIterator<String> iter1 = t.listIterator();
		while (iter1.hasNext()){
			assertEquals("a", iter1.next());
			assertEquals("b", iter1.next());
			assertEquals("c", iter1.next());
			assertEquals("d", iter1.next());
			assertEquals("e", iter1.next());
		}
	}

	/**
	 * prints elements that added
	 */

	@Test
	void testToString() {
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		assertEquals("abcde", t.toString());
	}

	/**
	 * checks the reverse walk of ListIterator
	 */
	@Test
	void testListIterator() {
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		ListIterator<String> iter1 = t.listIterator();
		while (iter1.hasPrevious()){
			assertEquals("e", iter1.previous());
			assertEquals("d", iter1.previous());
			assertEquals("c", iter1.previous());
			assertEquals("b", iter1.previous());
			assertEquals("a", iter1.previous());
		}
	}
}
