import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		int num;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the number");
		num=kb.nextInt();
		if(num%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("not even");
		}
	}
}
