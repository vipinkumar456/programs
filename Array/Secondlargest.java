
import java.util.Scanner;
class Secondlargest
{
	public static void main(String args[])throws Exception
	{
		int largest=0;
		int a[]={23,44,23,45,35,54};
		
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("the largest value is:"+a[a.length-2]);
	// }
}
}