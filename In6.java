 interface AA 
{ 
  void m1(); 
 } 
 interface BB 
{ 
  void m1(); 
} 
 class Myclass implements AA, BB 
{ 
  public void m1()
  { 
     System.out.println("Hello Java"); 
  } 
public static void main(String[] args) 
{ 
   Myclass mc = new Myclass(); 
    mc.m1(); 
  } 
}