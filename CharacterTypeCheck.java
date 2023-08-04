import java.util.Scanner;

public class CharacterTypeCheck {
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a character ");
char ch = scanner.next().charAt(0);

 if (isAlphabet(ch)) {
System.out.println(ch + " is an alphabet");
}
else if (isDigit(ch))
{
System.out.println(ch + " is a digit.");
 }
 else {
System.out.println(ch + " is a special character.");
}
}
public static boolean isAlphabet(char ch) {
 return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
}
public static boolean isDigit(char ch) {
return ch >= '0' && ch <= '9';
    }
}

