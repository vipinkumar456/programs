class Loops17
{
	public static void main(String args[])
	{
 		for(int i=1;i<=5;i++)
		{
			for(int k=i;k<=5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
				for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}