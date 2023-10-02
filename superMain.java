class super1
{
    int i=10;
}
class super2 extends super1
{
      int i=20;
      void disp()
      {
              System.out.println("The i value in super class is:"+super.i);
              System.out.println("The i value in sub class is:"+i);
     }
}
class Main
{
  public static void main(String args[])
   {
     super2 s1=new super2();
      s1.disp();
   }
 }
