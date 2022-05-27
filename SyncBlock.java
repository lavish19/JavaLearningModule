package sychronization;

 class PrintDemo {
	void printCount() {
		try {
			for(int i=5;i>=0;i--) {
				System.out.println("counter --- "+i);
			}
		}catch(Exception e) {
			System.out.println("Thread interuppted Exception"+e);
		}
	}

}
 class ThreadDemo extends Thread{
	 private String ThreadName;
	 PrintDemo PD;
	 private Thread t;
	 ThreadDemo(String name,PrintDemo pd){
		 ThreadName=name;
		 PD=pd;
	 }
	 public void run() {
		 synchronized(PD){
			 PD.printCount();
		 }
		 System.out.println("Thread "+ThreadName+ " exiting ");
	 }
	 public void start() {
		 if(t==null) {
			 t=new Thread(this,ThreadName);
			 t.start();
		 }
	 }
 }
 class SyncBlock{
	 public static void main(String[] args) {
		 PrintDemo PD=new PrintDemo();
		 ThreadDemo t1=new ThreadDemo("Thread - 1",PD);
		 ThreadDemo t2=new ThreadDemo("Thread - 2",PD);
		 t1.start();
		 t2.start();
		 try {
			 t1.join();
			 t2.join();
		 }catch(Exception e) {
			 System.out.println("Thread exception "+e);
		 }
	 }
 }
