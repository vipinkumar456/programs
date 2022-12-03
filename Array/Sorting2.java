
import java.util.Scanner;
class Sorting2
{
	public static void main(String args[])throws Exception
	{
		int largest=0,counter,temp;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter number of element in array");
		int n=kb.nextInt();
		int a[]=new int[n];
		
		
		System.out.println("enter value in array");
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
			
		}
		// System.out.println("the numbers are:"+a[n]);
		
	 for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n-1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n-1]);
	}
}
