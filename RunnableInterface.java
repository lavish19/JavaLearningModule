//program to demonstrate runnable interface
 class Star implements Runnable {
	public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println("*");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
 class Hash implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("#");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
	}
}}
public class RunnableInterface{
	public static void main(String[]args) {
		Star s=new Star();
		Hash h=new Hash();
		Thread t1=new Thread(s);
		Thread t2=new Thread(h);
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
	}
}
