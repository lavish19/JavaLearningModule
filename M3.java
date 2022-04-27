//program to demonstrate inter thread communication
 class A   {
	int num;
	boolean valueSet=false;
	public synchronized void put(int num) {
		while(valueSet) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("put "+num);
		this.num=num;
		valueSet=true;
		notify();
	}
	public synchronized void get() {
		while(!valueSet) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("get "+num);
		
		valueSet=false;
		notify();
	}

}
 class Producer implements Runnable{
	 A a;
	 public Producer(A a) {
		 this.a=a;
	 Thread t1=new Thread(this,"Producer");
	 t1.start();
	 
	 }
	 public void run() {
		 int i=0;
		 while(true) {
			 a.put(i++);
			 try {Thread.sleep(500);}catch(Exception e) {}
		 }
	 }
 }
 class Consumer implements Runnable{
	 A a;
	 public Consumer(A a) {
		 this.a=a;
		 
	 }
	 public void run() {
		 while(true) {
			 a.get();
			 try {Thread.sleep(500);}catch(Exception e) {}
		 }
	 }
 }
 class M3{
	 public static void main(String[] args) {
		 A a=new A();
		 new Producer(a);
		 new Consumer(a);
	 }
 }
