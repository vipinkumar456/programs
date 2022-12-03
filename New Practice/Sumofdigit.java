import java.util.Scanner;
class Sumofdigit
{
	public static void main(String args[])
	{
		int num,sum=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the number");
		num=kb.nextInt();
		for( ;num!=0; )
		{	
		sum=sum+num%10;
		num=num/10;
		}
		System.out.println(sum);
	}
}
