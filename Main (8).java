import java.util.List;
import java.util.ArrayList;
//program to illustrate auto-box unboxing usage

public class Main {
   public static void main(String[] args) {
    
      List<Integer> numLst = new ArrayList<>();  // List of Integer object (not int)
      numLst.add(111);  // auto-box primitive int to Integer object
      numLst.add(222);
      System.out.println(numLst);    //[111, 222]
      int firstNum = numLst.get(0);  // auto-unbox Integer object to int primitive
      System.out.println(firstNum);  //111

      //numLst.add(33.33);           // Only accept Integer or int(auto-box)
      //compilation error: incompatible types: double cannot be converted to Integer
   }
}