package hw1;

public class Multithreading implements Runnable {
	Thread t;
	
	Multithreading() {
		// create new thread
		t = new Thread(this, "hread");
		System.out.println("Child thread: " + t);
		t.start(); // start
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				counter();
				// pause
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
	}
	
	public void counter(){
		for(int i=0;i<100;i++)
		{
			System.out.print(i+" ");
		}
	}
	
}
