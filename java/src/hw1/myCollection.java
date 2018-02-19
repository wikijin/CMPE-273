package hw1;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class myCollection<T> {
	private List<T> myCollection = new LinkedList<>();
	private int size;

	myCollection(){
		size=0;
	}
	public void add(T item){
		myCollection.add(item);
		size++;
	}
	
	public void delete (T item){
		myCollection.remove(item);
		size--;
	}
	
	public void display(){
      Iterator itr = myCollection.iterator();
      while (itr.hasNext()) {
         String str = (String) itr.next();
         System.out.print(str + " ");
      }
      System.out.println();
	}
	
	public int size(){
		return this.size;
	}
	
}
