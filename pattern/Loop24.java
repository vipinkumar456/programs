class Loop24

{
	public static void main(String args[])
	{
		
	for(char i='A';i<='E';i++)
	{
		
		for(char j='A';j<=i;j++)
		{
			System.out.print(" ");
		}
		
		for(char j=i;j<='E';j++)
		{
			System.out.print(j);
		}
	
		for(int j='D';j>=i;j--)
		{
			System.out.print((char)j);
		}
		
		
		
		System.out.println();
	}
	}
}	