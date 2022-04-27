//program to demonstrate various methods of runnable interface using lambda expressions 
 class M2  {
	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<=5;i++) {
				System.out.println("hi "+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
			}
		});
		Thread t2=new Thread(() ->{
			for(int i=0;i<=5;i++) {
				System.out.println("hello "+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);}
				catch(Exception e) {
				}
			}
		});
		
		t1.getName();
		t2.getName();
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);	
	t1.start();
	try {Thread.sleep(10);}catch(Exception e){}
	t2.start();
	t1.join();
	t2.join();
	t1.isAlive();
	t2.isAlive();
	}
}
