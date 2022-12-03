
import java.util.Scanner;
class Largestuser
{
	public static void main(String args[])throws Exception
	{
		int largest=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter number of element in array");
		int n=kb.nextInt();
		int a[]=new int[n];
		
		
		System.out.println("enter value in array");
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
			
		}
		
		
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("the largest value is:"+largest);
	// }
}
}