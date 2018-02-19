package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class genericsTest {

	Generics gen = new Generics();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void integerTest() {
		 Integer[] intArray = { 1, 2, 3, 4, 5 };
		 System.out.println( "Print integer " );
		  gen.printArray(intArray);
	}
	
	@Test
	public void doubleTest() {
		Double[] doubleArray = {1.2,2.3,3.4,4.5};
		System.out.println( "\nprint double " );
		gen.printArray(doubleArray);
	}
	
	@Test
	public void charTest() {
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println( "\nprint double " );
        gen.printArray( charArray );
	}
   
}
