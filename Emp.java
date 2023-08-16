import java.util.*;
class Emp
{
void setEmp(int eno,int esal, String ename)
{
System.out.println("emp name:"+ename);
System.out.println("emp eno:"+eno);
System.out.println("emp sal:"+esal);
}
}
class Main
{
public static void main(String[]args)

{
 int eno,esal;
 String ename;
 Emp e= new Emp();
 Scanner sc=new Scanner(System.in);
System.out.println("enter the emp name:");
ename=sc.next();
System.out.println("enter the emp eno:");
eno=sc.nextInt();
System.out.println("enter the emp sal:");
esal=sc.nextInt();
e.setEmp(eno,esal,ename);
}
}

