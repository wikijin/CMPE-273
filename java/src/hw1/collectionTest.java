package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class collectionTest {
	
	myCollection<String> myCol;
	
	@Before
	public void setUp() throws Exception {
		myCol= new myCollection<>();
		System.out.println("setup");
	}

	@Test
	public void addTest() {
		myCol.add("a");
		assertEquals(1,myCol.size());
		System.out.println("add test ");
	}
	
	@Test
	public void removeTest() {
		myCol.add("a");
		myCol.delete("a");
		assertEquals(0,myCol.size());
		System.out.println(" remove");
	}
	
	@Test
	public void displayTest() {
		myCol.add("a");
		myCol.add("b");
		myCol.display();
		System.out.println("display");
	}
	
	@Test
	public void sizeTest() {
		myCol.add("a");
		myCol.add("b");
		assertEquals(2,myCol.size());
		System.out.println("size");
	}

}
