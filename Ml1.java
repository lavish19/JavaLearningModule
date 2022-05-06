class A implements Runnable{
	public void run() {
		try {
		Thread.sleep(100);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println("the state of thread t1 while it invoke join() method on thread t2 - "+ThreadState.t1.getState());
		try {
			Thread.sleep(200);
		}catch(InterruptedException e)	{
			e.printStackTrace();
		}
}}
class ThreadState implements Runnable{
	public static Thread t1;
	public static ThreadState obj;
	public static void main(String[] args) {
		obj=new ThreadState();
		t1=new Thread(obj);
		System.out.println("current state of the thread - "+t1.getState())	;
		t1.start();
		System.out.println("the state of t1 after invoking method start() on it - "+t1.getState())	;
	}
	public void run() {
		A obj=new A();
		Thread t2=new Thread(obj);
		System.out.println("current state of thread t2 - "+t2.getState())	;
		t2.start();
		System.out.println("the state of t2 after invoking method start on it - "+t2.getState());
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the state of thread t2 after invoking sleep() method on it - "+t2.getState());
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the state of thread t2 after complete execution is completed - "+t2.getState());
	}
}