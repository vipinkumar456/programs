class Loop23

{
	public static void main(String args[])
	{
		
	for(char i='A';i<='E';i++)
	{
		
		for(char j=i;j<='E';j++)
		{
			System.out.print(" ");
		}
		
		for(int j='A';j<=i;j++)
		{
			System.out.print((char)j);
		}
	
		for(int j=i-1;j>='A';j--)
		{
			System.out.print((char)j);
		}
		
		
		
		System.out.println();
	}
	}
}	