//program to demonstrate controlling execution of threads by join method
public class Directing {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<=5;i++) {
				System.out.println("hi");
				try {Thread.sleep(500);}
				catch(Exception e) {}
				}
			
		});
		Thread t2=new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("hello");
				try {Thread.sleep(500);}
				catch(Exception e) {}
				
			}
		});
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		t1.join();
		t2.join();
		t1.isAlive();
		System.out.println("goodbye");
	}
	

}
