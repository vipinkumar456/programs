import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		
		int rev=0;
		
		Scanner kb=new Scanner(System.in);
	System.out.println("enter the number");	
	int num=kb.nextInt();
	
		int temp=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("given number is reverseable");
		}
		else
		{
			System.out.println("given number is not reversable");
		}
		
}
}
