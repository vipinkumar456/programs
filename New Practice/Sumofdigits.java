import java.util.Scanner;
class Sumofdigits
{
	public static void main(String args[])
	{
		int num,sum=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the number");
		num=kb.nextInt();
		sum=sum+num%10;
		num=num/10;
		sum=sum+num%10;
		num=num/10;
		sum=sum+num%10;
		num=num/10;
		System.out.println(sum);
	}
}
