import java.util.*;
public class fac 
{

public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);

int i=1,f=1;
int n;
n=sc.nextInt();
System.out.println("enter the n value");
while(i<=n)
{
f=f*i;
i++;
}
System.out.println(f);
}
}
