import java.util.*;

public class arrayy
{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n,i;
int sum=0;
System.out.println("enter the array size");
n=sc.nextInt();
int a[]=new int[n];
 System.out.println("enter elements of array");
 for(i=0;i<a.length;i++)
 a[i]=sc.nextInt();
 
System.out.println("value of array");
for( i=0;i<a.length;i++)
	{
System.out.println(a[i]);
 for(i=0;i<a.length;i++)
 sum =sum+a[i];
 System.out.println("total sum is"+sum);
 
	}
}
}
