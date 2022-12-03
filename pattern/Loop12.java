class Loop12
{
	public static void main(String args[])
	{
		
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		for(int l=1;l<=i;l++)
		{
			System.out.print((char)l);
		}
		System.out.println();
	}
	}
}	