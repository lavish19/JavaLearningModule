//program to demonstrate thread sleep method usage
public class ThreadSleep extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
}
public static void main(String[] args) {
	ThreadSleep s=new ThreadSleep();
	s.start();
	ThreadSleep c=new ThreadSleep();
	c.start();
	
}
}
