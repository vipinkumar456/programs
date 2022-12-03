
import java.util.Scanner;
class TwoDimension
{
	public static void main(String args[])throws Exception
	{
		int largest=0;
		int a[][]={{1,2,3},{4,5,4}};
		// Scanner kb=new Scanner(System.in);
		// a[5]=kb.nextInt();
		// System.out.println("enter value in array");
		// a[0]=10;
		// a[1]=40;
		// a[2]=30;
		// a[3]=20;
		// a[4]=1;
		for(int i=0;i<a.length+1;i++)
		{
			for(int j=0;j<a.length+1;j++)
			{
				System.out.print(a[i][j]+" ");
			System.out.println();
			}
		}
		// {
			// if(a[i]>largest)
			// {
				// largest=a[i];
			// }
		// }
		// System.out.println("the largest value is:"+largest);
	}
}