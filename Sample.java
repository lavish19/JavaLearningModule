 class Sample implements Runnable {
	private Thread t;
	private String threadName;
	Sample(String name){
		threadName=name;
		System.out.println("creating "+ threadName);
	}
	public void run() {
		System.out.println("running"+threadName);
		try {
			for(int i=0;i>4;i--) {
				System.out.println("Thread"+ threadName+i);
				Thread.sleep(50);
				
			}
		}catch(InterruptedException e) {
			System.out.println("thread"+threadName+"Interrupted");
			
		}
		System.out.println("thread"+threadName+"exciting");
		
	}
	public void start() {
		System.out.println("starting thread	"+ threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
			
		}
	}
}
  class Sample1{
 public static void main(String[] args) {
	 Sample r1=new Sample("thread 1");
	 r1.start();
	 Sample r2=new Sample("thread 2");
	 
 }}
