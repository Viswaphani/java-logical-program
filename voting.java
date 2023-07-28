import java.util.*;
public voting main
{

public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 
int age;
System.out.println("enter the age");
age=sc.nextInt();
if (age>=18)
{
    
    System.out.println("eligible for voting 18");
    
}
else
  {
      System.out.println("less than 18 not eligible for voting ");
  }  
}
}
