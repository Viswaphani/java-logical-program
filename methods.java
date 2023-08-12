import java.util.*;
class student
{
 int id;
 String sname;
 String email;
 Scanner sc=new Scanner(System.in);


 
void getstudent()
{
System.out.println("enter student name:");
sname=sc.next();
System.out.println("enter student id:");
id=sc.nextInt();
System.out.println("enter student email:");
email=sc.next();
}
void dispstudent()
{
System.out.println("student name:"+sname);
System.out.println(" student id:"+id);
System.out.println("student email:"+email);
}
}
class methods
{
    public static void main (String[] args) 
    {
      student s=new student();
     
 s.getstudent();
 s.dispstudent();
    }
}
  
