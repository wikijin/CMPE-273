package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class arrayTest {

	@Before
	public void setUp() throws Exception {
	}
	myArray array = new myArray(10);
	
	@Test
	public void myArrayTest (){
		myArray array = new myArray(10);
		System.out.println("create");
	}

	@Test
	public void size(){
		assertEquals(array.size(),0);
		System.out.println("size");
	}
	
	@Test
	public void add (){
		array.add(0,0);
		array.add(1,1);
		assertEquals(array.size(),2);
		System.out.println("add");
		
	}
	
	@Test
	public void  get(){
		array.add(0,0);
		array.add(1,1);
		assertEquals(array.get(1),1);
		System.out.println("get");	
	}

}
