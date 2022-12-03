class Loop65
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i<=20;i+=5)
		{
			for(j=i;j<=i+60;j=j+20)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}