import java.util.*;
class principle{
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 Float p,t,r,si,tot;
 System.out.println("enter the principle amount ");
 p=sc.nextFloat();
 System.out.println("enter the total months");
 t=sc.nextFloat();
 System.out.println("enter the rate of interest");
 r=sc.nextFloat();
 
 si=p*t*r/100;
 tot=p+si;
System.out.println("the simple intrest is"+si);
System.out.println("total amount is"+tot);
    }
}
/*write a java program to enter principle amount,total no of months and rate of intrest, caluculate the simple intrest and total amount?

p*t*r/100
    
si=p*t*r/100
tot=p+si*/
