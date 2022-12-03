import java.util.Scanner;
class Palindrome2
{
	public static void main(String args[])
	{
	String reverse="";
	// Scanner kb=new Scanner(System.in);
	// System.out.println("enter the name");
	String name="puneet";
	for(int i=name.length()-1;i>=0;i--)
	{
		reverse=reverse+name.charAt(i);
	}
	// if(name.equals(reverse))
	// {
		// System.out.println("string is palindrome");
	// }
	// else
	// {
		// System.out.println("given string is  not palindrome");
	// }
	System.out.println("the name after reverse:"+name);
	System.out.println("the name after reverse:"+reverse);
	
}
}