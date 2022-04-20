/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//java program to demostrate working of arraylist
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		ArrayList<Integer>l=new ArrayList<Integer>();
		for(int i=0;i<=5;i++){
		    l.add(i);
		    System.out.println(l);
		}
		l.remove(4);
		for(int i=0;i<=l.size();i++){
		    System.out.println(l.get(i)+" ");
		    
		}
		
	}
}
