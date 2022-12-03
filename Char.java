import java.util.Scanner;
class Char
{
	public static void main(String args[])
	{
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		char ch=kb.next().charAt(0);
		
		
		if((ch>='a'|| ch<='z')||(ch>='a'||ch<='z'))
		{
			System.out.println("number in alphabet");
		}
		else
		{
			System.out.println("number not an alphabet");
		}
	}
}