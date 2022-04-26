//program to demonstrate join method usage
import java.io.*;
public class JoinMeth extends Thread {
public void run() {
		for(int j=0;j<2;j++) {
			try {
			Thread.sleep(300);
			System.out.println("The name of the current thread is "+Thread.currentThread().getName());
		}
		catch(Exception e) {
			System.out.println("Exception has been caught"+e);
		}
	System.out.println(j);
	}
}
}
 class ThreadJoinExample{
	public static void main(String[] args) {
		JoinMeth j=new JoinMeth();
		JoinMeth m=new JoinMeth();
		JoinMeth t=new JoinMeth();
		j.start();
		try {
			System.out.println("the current thread name is "+ Thread.currentThread().getName());
			j.join();
		}catch(Exception e){
			System.out.println("exception has been caught"+e);
		}
		m.start();
		try {
			System.out.println("the current thread name is "+ Thread.currentThread().getName());
			m.join();
		}
		catch(Exception e) {
			System.out.println("Exception has been caught"+e);
				
			}
		t.start();
		try {
			System.out.println("the name of the current thread is"+Thread.currentThread().getName());
			t.join();
		}
		catch(Exception e) {
			System.out.println("exception has been caught"+e);
		}
		}
	}

