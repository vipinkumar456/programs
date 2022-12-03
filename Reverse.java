import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the number");
		int num=kb.nextInt();
		/*System.out.println(" enter rev");
		int rev=kb.nextInt();*/
		int rev=0;
		
		while(num!=0)
		{
		rev=rev*10+num%10;
		num=num/10;
	    }
		System.out.println(+rev);/*
	if(rev.equals(num))
	{
		System.out.println("number is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
		
	}*/
	}
}