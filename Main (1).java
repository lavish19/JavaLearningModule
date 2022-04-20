/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]=new int[] {1,2,3,4};
		Vector<Integer> v=new Vector();
		Hashtable<Integer,String> h=new Hashtable();
		v.addElement(9);
		v.addElement(8);
		h.put(7,"ken");
		h.put(5,"fin");
		System.out.println(arr[2]);
		System.out.println(v.elementAt(1));
		System.out.println(h.get(7));
	}
}
