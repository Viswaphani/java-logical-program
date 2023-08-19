import java.util.*;
class student
{
    int sno;
     String sname;
    int m1,m2,m3;
      Scanner sc=new Scanner(System.in);
      void read()
       {
            System.out.println("Enter Student Number:");
            sno=sc.nextInt();
             System.out.println("Enter Student Name");
            sname=sc.next();
            System.out.println("Enter Student Marks");
             m1=sc.nextInt();               
             m2=sc.nextInt();
             m3=sc.nextInt();
        }
}
class student1 extends student
{
        int tot;
         float avg;
          void total()
           {
             tot=m1+m2+m3;
                 avg=tot/3;
           }
}
class student2 extends student1
{
     
           void  report()
             {
                 System.out.println("The Student NO is:"+sno);
                 System.out.println("The Student Name is:"+sname);
                  System.out.println("The Student Total is:"+tot);
System.out.println("The Student Average is:"+avg);
              }
}
class multilevel
{
     public static void main(String args[])
        {
              student2 s=new student2();
               s.read();
                s.total();
                s.report();
         }
}
