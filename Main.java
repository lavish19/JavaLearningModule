//program to demostrate ArrayList usage
import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<String>();//creating ArrayList
        list.add("suresh");
        list.add("mahesh");
        list.add("dinesh");
        list.add("ramesh");
        list.add("mukesh");
        Iterator itr=list.iterator();//traversing through ArrayList
        while(itr.hasNext()){
           System.out.println(itr.next());
        }
    }
}