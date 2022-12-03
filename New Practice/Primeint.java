import java.util.Scanner;
class Primeint
{
	
	public static void main(String args[])
	{
		int count=0,i,j;
		System.out.println("the prime numbers between 20 and 30 are:");
		for(i=2;i<=100;i++)
		{
			for(j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				else
				{
					count=1;
				}
			}
			if(count==1)
			{
				System.out.println(i);
			} 
		}
		
		
	}
}