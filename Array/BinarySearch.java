package array;
import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		
	
	int[] a={12,23,34,45,47,48,65,87};
	int search=23;
	int li=0;
	int hi=a.length-1;
	int mi=(li+hi)/2;
	
	while(li<hi)
	{
			if(a[mi]==search)
			{
				System.out.println("item found at "+mi +"position");
				break;
			}
			else if(a[mi]<search)
			{
				
				 
					 li=mi+1;
				 
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
	}
	if(hi>li)
	{
		System.out.println("element not found");
	}
	else if(a[mi]!=search)
		
	{
		System.out.println("item not found");
	}
}
}