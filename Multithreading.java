
public class Multithreading extends Thread {//thread creation by extending thread class
	public void run() {
		try {//displaying thread that is running
			System.out.println("thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {//throwing an exception 
			System.out.println("Exception is caught");
		}
	}
public class Multithread{
	public static void main(String[] args) {
		int n=8;//number of threads
		for(int i=0;i<n;i++) {
		Multithreading obj=new Multithreading();
		obj.start();
		}
	}
}
	
}

