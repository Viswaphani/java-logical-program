/*Write a java program to enter student number , student name , 3 subjects of marks, calcualte total marks and Average and display the report?*/

import java.util.*;
class Marks{
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int sno,ph,mth,chm;
 String sn;
 Float avg, tot;
 
 System.out.println("given student number");
 sno=sc.nextInt();
 System.out.println("given student name");
 sn=sc.next();

 System.out.println("given physics marks");
 ph=sc.nextInt();
 System.out.println("given maths marks");
 mth=sc.nextInt();
 System.out.println("given chemistry marks");
 chm=sc.nextInt();
  
  tot=(float)ph+mth+chm;
  avg=tot/3;
  
 System.out.println("given student number"+sno);
 System.out.println("given student name"+sn);
 System.out.println("given physics marks"+ph);
 System.out.println("given maths marks"+mth);
 System.out.println("given chemistry marks"+chm);
 
 
    }
 
}
 
 
 
 
 
