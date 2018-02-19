package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class interfaceTest {

	private myInfo info;
	@Before
	public void setUp() throws Exception{
		info = new myInfo();
	}
	
	@Test
	public void addName() {
		info.setName("b", "a");
		assertEquals("b",info.getFirstName());
		assertEquals("a",info.getLastName());
		System.out.println("add and get name");
	}
	
	@Test
	public void addAge() {
		info.setAge(20);
		assertEquals(20,info.getAge());
		System.out.println("addAge & get age");
	}

	@Test
	public void addGender() {
		info.setGender("Male");
		assertEquals("Male",info.getGender());
		System.out.println("add & get gender");
	}
}
