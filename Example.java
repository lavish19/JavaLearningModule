public class Example extends Thread  
{  
Thread threadToInterrupt;  
// overriding the run() method  
public void run()  
{  
// invoking the method interrupt  
threadToInterrupt.interrupt();  
}  
}  
  
  
 class ThreadJoinExample1  
{  
// main method  
public static void main(String[] argvs)  
{  
try  
{  
// creating an object of the class ABC  
Example th1 = new Example();  
  
th1.threadToInterrupt = Thread.currentThread();  
th1.start();  
  
// invoking the join() method leads   
// to the generation of InterruptedException  
th1.join();  
}  
catch (InterruptedException ex)  
{  
System.out.println("The exception has been caught. " + ex);  
}  
}  
}  