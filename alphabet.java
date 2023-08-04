import java.util.Scanner;

public class alphabet {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a character: ");
char ch = scanner.next().charAt(0);

if (isAlphabet(ch)) {
System.out.println(ch + " is an alphabet.");
}
else {
System.out.println(ch + " is not an alphabet.");
}
}

public static boolean isAlphabet(char ch) {

return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
