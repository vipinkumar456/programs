import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		
		int fact=1;
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

