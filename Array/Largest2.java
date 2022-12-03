
import java.util.Scanner;
class Largest2
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
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(a[i][j]);
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