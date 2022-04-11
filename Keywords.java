class Keywords{

   static int count=0;//Static variable initialized in data field members
   public void increment()
   {
       count++;
   }
   public static void main(String args[])
   {
       Keywords obj1=new Keywords();
       Keywords obj2=new Keywords();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+Keywords.count);
       System.out.println("Obj2: count is="+Keywords.count);
   }
}