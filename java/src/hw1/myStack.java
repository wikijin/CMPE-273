package hw1;

import java.util.*;
import java.util.LinkedList;

public class myStack<T> {
	private List<T> stack=new LinkedList<T>();
	
	public myStack(){
	}
	
	public int size(){
		return stack.size();
	}
	
	public void push (T x){
		stack.add(x);
	}
	
	public T pop(){
		int size=size();
		size--;
		T element= stack.remove(size);
		return element;
	}
}
