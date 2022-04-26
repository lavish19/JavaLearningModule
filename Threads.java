
public class Threads implements Runnable {
	public void run() {
		System.out.println("now thread is running");
	}
public static void main(String[] args) {
	Runnable r=new Threads();
	Thread t=new Thread(r,"new thread");
	t.start();
	String str=t.getName();
	System.out.println(str);
}
}
