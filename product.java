/*Write a java program to enter product number , product name , product cost and product quantity, calcualte total amount and display the report?*/

import java.util.*;
class product{
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int pno;
 String pn;
 float pc,pq;
 System.out.println("enter the product number");
 pno=sc.nextInt();
 System.out.println("enter the product name");
 pn=sc.next();
 System.out.println("enter the product cost");
 pc=sc.nextFloat();
 System.out.println("enter the product quantity");
 pq=sc.nextFloat();
 
 float tot=pc*pq;
 System.out.println("given product number"+pno);
 System.out.println("given product name"+pn);
 System.out.println("given product cost"+pc);
 System.out.println("given product quantity"+pq);
 
 System.out.println("the total amount is"+tot);
 
    }
 
}
 
 
 
 
 
