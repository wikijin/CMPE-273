package hw1;

import java.util.LinkedList;

public class myQueue<T> {

	private final LinkedList<T> q = new LinkedList<>();
	
	//add new element into queue
	public void enqueue(T elem){
		 q.add(elem);
	}
	
	// pop first element from queue
	public T dequeue (){
		return q.remove();
	}
	
	//return true if queue is empty
	public boolean isEmpty(){
		return q.isEmpty();
	}
	
	//return first item in queue
	public T peek(){
		return q.peek();
	}
	
	//return size of queue
	public int size(){
		return q.size();
	}
	
}
