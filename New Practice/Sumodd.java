import java.util.Scanner;
class Sumodd
{
	public static void main(String args[])
	{
		int num,sum=0;
		for(num=1;num<=20;num++)
		{
			if(num%2!=0)
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}
}
