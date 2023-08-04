import java.util.Scanner;

public class UppercaseLowercaseCheck
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a character ");
char ch = scanner.next().charAt(0);
if (isUppercaseAlphabet(ch)) {
System.out.println(ch + " is an uppercase alphabet.");
}
else if (isLowercaseAlphabet(ch)) {
System.out.println(ch + " is a lowercase alphabet.");
}
else {
System.out.println(ch + " is not an alphabet.");
}
    }

  public static boolean isUppercaseAlphabet(char ch) {
return ch >= 'A' && ch <= 'Z';
}

public static boolean isLowercaseAlphabet(char ch) {
return ch >= 'a' && ch <= 'z';
    }
}
