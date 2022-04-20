
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class J5ListOfStringTest {
   public static void main(String[] args) {
      
      List<String> coffeeLst = new ArrayList<>();
      coffeeLst.add("espresso");
      coffeeLst.add("latte");
      coffeeLst.add("cappuccino");
      System.out.println(coffeeLst);  //[espresso, latte, cappuccino]

      // (1) Use an Iterator<String> to traverse through all the elements
      Iterator<String> iter = coffeeLst.iterator();
      while (iter.hasNext()) {
         String str = iter.next();
         System.out.println(str);
      }
      
      for (String str : coffeeLst) System.out.println(str.toUpperCase());
      
      for (int i = 0; i < coffeeLst.size(); ++i) {
         System.out.println(coffeeLst.get(i).substring(0, 3));
      }
      
   }
}