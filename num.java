import java.util.*;
public class num 
{

public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);

int i=1,sum=0;
int n;
n=sc.nextInt();
System.out.println("enter the n value");
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(sum);
}
}
