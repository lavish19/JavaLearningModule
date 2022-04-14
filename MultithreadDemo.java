
public class MultithreadDemo implements Runnable {//Thread class implements runnable interface
	public void run() {
		try {
			System.out.println("thread"+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("exception caught");
		}
		
	}
public class Demo{
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++) {
		Thread t=new Thread(new MultithreadDemo());
		t.start();
	}
}}}

