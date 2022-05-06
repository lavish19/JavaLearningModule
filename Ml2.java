import java.util.*;
import java.io.*;
public class Ml2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(300)	;
			}catch(Exception e) {
				System.out.println("Exception has been caught"+e);
			}
			System.out.println(i);
		}
	}
}
 class ThreadExample{
	public static void main(String[] args) {
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		t1.start();
		try {
			System.out.println("the state of the current thread is - "+Thread.currentThread().getState());
			System.out.println("the current thread name is - "+Thread.currentThread().getName())	;
		t1.join();}catch(Exception e) {
			System.out.println("exception has been caught"+e);
		}
		t2.start();
		try {
			System.out.println("the state of the current thread is - "+Thread.currentThread().getState());
			System.out.println("the current thread name is - "+Thread.currentThread().getName());
			t2.join();
		}catch(Exception e) {
			System.out.println("exception has been caught"+e);
		}
		t3.start();
		
	}
	
}
