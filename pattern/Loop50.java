class Loop50

{
	public static void main(String args[])
	{
		int num=5;
		int n=num;
	for(int i=1;i<=5;i++,n--)
	{
		
		for(int j=n;j<=num;j++)
		{
			
			System.out.print(j);
		}
		for(int k=num-1;k>=n;k--)
		{
			
			System.out.print(k);
		}
		
		
		System.out.println();
	}
	}
}	