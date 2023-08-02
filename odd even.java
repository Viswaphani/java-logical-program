import java.util.*;
public class oddeven
{

public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a number");
int number = sc.nextInt();
if (isEven(number)) 
{
System.out.println(number + " is an even number.");
}
else 
{
System.out.println(number + " is an odd number.");
 }

}

 public static boolean isEven(int number)
    {
  
return number % 2 == 0;
    }
}
