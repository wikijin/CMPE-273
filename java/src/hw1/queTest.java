package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class queTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	private myQueue<Integer> q = new myQueue<>();
	
	@Test
	public void testIsQueueEmpty(){
		assertTrue(q.isEmpty());
		System.out.println("Empty");
	}

    @Test
    public void testIsEmptyFalse() {
    	q.enqueue(10);
        q.enqueue(9);
        assertFalse( q.isEmpty() );
        System.out.println("isEmpty");
    }
    
    @Test
    public void testAdd(){
    	q.enqueue(1);
    	assertEquals(q.peek(),new Integer(1));
    	System.out.println("add");
    }
    
    @Test
    public void testPeek(){
    	q.enqueue(1);
    	assertEquals(q.peek(),new Integer(1));
    	System.out.println("peek");
    }
    
    @Test
    public void testRemove() 
    {
        q.enqueue(1);
        assertEquals(new Integer(1),q.dequeue());
        System.out.println("remove");
    }
    
    
    
    @Test
    public void testSizeFail() 
    {
        assertNotEquals(1,q.size());
        System.out.println("size");
    }
    
    @Test
    public void testSize() 
    {
    	q.enqueue(1);
        assertEquals(1,q.size());
        System.out.println("size");
    }
    
}
