class base
{
 protected int a,b,c;
 base()
 {
 a=10; 
 b=20;
 }
void add()
{
c=a+b;
System.out.println("The Addition is:"+c);
}
}
class derive extends base
{
int d; 
void mul()
{
d=a*b;
System.out.println("The Multilication is :"+d);
}
}
class inherit
{
 public static void main(String args[])
 {
derive d1=new derive();
d1.add();
d1.mul();
     }
}
