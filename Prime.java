import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int i,num,temp=0;
		Scanner pm=new Scanner(System.in);
		System.out.println("enter the number");
		num=pm.nextInt();
		
		for(i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
				
			}
		}
		   if(temp==0)
		   {
			   System.out.println(" prime");
			   
		   }
		   else
		   {
			   System.out.println(" not prime");
		   }
		
	}
}