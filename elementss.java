import java.util.*;
public class elementss
{

public static void main(String[]args)
{
 int i,j,r,c;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the row");
 r=sc.nextInt();
 System.out.println("enter the col");
 c=sc.nextInt();
 int a[][]=new int[r][c];
 
 System.out.println("enter the elements:");
 
 for(i=0;i<r;i++)
 {
     for(j=0;j<c;j++)
     {

  a[i][j]=sc.nextInt();
     }
 }
    
    
    
 System.out.println("elements in an array is:");
 
 for(i=0;i<r;i++)
 {
     for(j=0;j<c;j++)
     {
    
    System.out.print(" " +a[i][j]);
     }
    System.out.println();
 }
     }
 }

 
