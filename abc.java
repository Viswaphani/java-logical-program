import java.util.*;
class abc
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("Enter the a value");
       a=sc.nextInt();
       System.out.println("Enter the b value");
       b=sc.nextInt();
       System.out.println("Enter the c value");
       c=sc.nextInt();
 
if(a>b)
{      
if(a>c)
{
System.out.println("a is big");
}   
  else
{
System.out.println("c is big");
}
}
else
 {            
if(b>c)
 System.out.println("b is big");
 else
 System.out.println("c is big");
 }
   }
   }
