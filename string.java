public class string
{
	public static void main(String[] args)
	{
	   String st1="Welcome";
	   String st2="WELCOME";
	   // length():- Find the length of the given string
	   System.out.println("The Lenght of the Given String is:"+st1.length());
	   
	   // charAt():- it returns specified character from the given string
	   System.out.println("The 3rd Charactr in Given String is:"+st1.charAt(3));
	   
	   // indexOf():- it returns specified character position from the given string
  
System.out.println("The 'c' Charactr Position in Given String is:"+st1.indexOf('c'));
       System.out.println("The 'e' Charactr Position in Given String is:"+st1.lastIndexOf('e'));
       
       // substring(): it return sub string in the given string
       System.out.println("The Sub String is:"+st1.substring(3));
       System.out.println("The Sub String is:"+st1.substring(2,6));
       
       // toUpperCase():- its converts lower case letters to upper case letters
System.out.println("The String 1 Upper case is:"+st1.toUpperCase());
       
       // toLowerCase():- its converts upper case letters to lower case letters
       System.out.println("The String 2 Lower case is:"+st2.toLowerCase());
       
       // replace():- It replaces the caracter with specified character
       System.out.println("The String replace is:"+st1.replace('e','a'));
       
       // equals():it returns true if both string are same otherwise it returns false
System.out.println(st1.equalsIgnoreCase(st2));
       
	}
}
