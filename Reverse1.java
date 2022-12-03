import java.util.Scanner;
class Reverse1
{
	public static void main(String args[])
	{
		String reverse="";
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the name");
		String name=kb.nextLine();
		for(int i=name.length()-1;i>=0;i--)
		{	
		reverse=reverse+name.charAt(i);
	    }
		if(name.equals(reverse))
		{
			System.out.println("given String is pallindrome");
		}
		else
		{
	        System.out.println("not pallindrome");
	    }
    }
}