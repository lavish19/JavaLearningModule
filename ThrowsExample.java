//programs to demonstrate multiple Exception thrown usage
import java.io.*;
public class ThrowsExample {
	void myMethod(int num) throws IOException,ClassNotFoundException {
		if(num==0) {
			throw new IOException("input output exception has occured");
		}
		else
			throw new ClassNotFoundException("class not found exception has occured");
		
	}
	class New{
		public static void main(String[] args) {
			try {
				ThrowsExample t=new ThrowsExample();
				t.myMethod(0);//and if the value given is something else than the else part exception will get executed 
			}
			catch(Exception e) {
				System.out.println("Exception has occured"+e);
			}
		}
	}

}
