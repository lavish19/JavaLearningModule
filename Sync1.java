//program to demonstrate Synchronized block example using anonymous class
public class Sync1 {
	public void SenderMsg(String msg) {
		
		System.out.println("sending message "+msg);
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			System.out.println("interrupted exception "+e);
		}
		System.out.println("\n"+msg+" sent");
	}

}
class SenderThread extends Thread{
	private String msg;
	Sync1 s;
	SenderThread(String m,Sync1 obj){
		msg=m;
		s=obj;
	}
	public void run() {
		synchronized(s) {
			s.SenderMsg(msg);
		}
		
	}
}
class testSync{
	public static void main(String[] args) {
		Sync1 s1=new Sync1();
		SenderThread st1=new SenderThread("hello ",s1);
		SenderThread st2=new SenderThread("welcome to java module ",s1);
		st1.start();
		st2.start();
		try {
			st1.join();
			st2.join();
		}catch(Exception e) {
			System.out.println("interrupted"+e);
		}
	}
}
