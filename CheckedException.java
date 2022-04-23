//program to demonstrate/illustrate checked exception
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {
	FileInputStream f=null;
	try {
		f=new FileInputStream("B:/file.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("file not found");
		
	}
	int k;
	try {
		while((k=f.read() ) !=-1) {
			System.out.println((char)k);
		}
		f.close();}
		catch(IOException io) {
			System.out.println("Error occured"+io);
		}
	}
	}

