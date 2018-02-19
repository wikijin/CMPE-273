package hw1;

public class myArray {
	private int[] myArray;
	
	private int count = 0;
	
	public myArray (int size){
		myArray=new int [size];
	}
	
	public int size(){
		return count;
	}
	
	public void add (int index,int item){
		myArray[index]=item;
		count++;
	}
	
	public void remove (int index){
		count--;
	}
	
	public int get (int index){
		return myArray[index];
	}
}
