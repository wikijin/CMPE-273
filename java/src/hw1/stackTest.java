package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class stackTest {

	private myStack<Integer> stack = new myStack<>();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void stackEmpty() {
		assertEquals(0,stack.size());
		System.out.println("Empty");
	}
	
	@Test
	public void testAdd() {
		stack.push(1);
		assertEquals(1,stack.size());
		System.out.println("add");
	}

	@Test
	public void testpop() {
		stack.push(1);
		int elem = stack.pop();
		assertEquals(1,elem);
		System.out.println("pop");
	}
	
	
}
