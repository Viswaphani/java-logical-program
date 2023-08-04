import java.util.*;
public class fact 
{

public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);

int i=1,f=1;
int n;
System.out.println("enter the n value");
n=sc.nextInt();
for(i=1;i<=n;i++)

{
f=f*i;
}
System.out.println(f);

}
}
