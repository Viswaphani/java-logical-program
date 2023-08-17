import java.util.*;
class demo

{ 
void game(String n)
{


if(n.equals("yes"))
{

System.out.println("welcome to the game");
}
else
{
System.out.println("no");       
}
}
}

class Main
{
public static void main(String[]args)
{
demo d=new demo();
Scanner sc=new Scanner(System.in);
System.out.println("enter the game");
String n=sc.next();
d.game(n);
}


}
