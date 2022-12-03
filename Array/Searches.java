
import java.util.Scanner;
class Searches
{
	public static void main(String args[])throws Exception
	{
		int search=0,count=0;
		int a[]={23,44,23,45,35,54};
		
			Scanner kb=new Scanner(System.in);
			
		System.out.println("enter the element for search");
		int s=kb.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				count=0;
				break;
				
			}
			else
			{
				count=1;
			}
			
		// }
		// System.out.println("the largest value is:"+a[a.length-2]);
	// }
}
if(count==0)
{
	System.out.println("found");
}
else
{
	
	System.out.println("not found");
}
}
}