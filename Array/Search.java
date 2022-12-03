
import java.util.Scanner;
class Search
{
	public static void main(String args[])throws Exception
	{
		int largest=0,counter;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter number of element in array");
		int n=kb.nextInt();
		int a[]=new int[n];
		
		
		System.out.println("enter value in array");
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
			
		}
		System.out.println("enter the value to be searched ");
		int s=kb.nextInt();
		counter=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				largest=a[i];
			counter=1;
			break;
			}
		}
		if(counter==1)
		{
			System.out.println("number found");
		}
		else{
			System.out.println("number not found");
		}
		// System.out.println("the largest value is:"+largest);
	}
}
