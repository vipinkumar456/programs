class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1;
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			a=b;
			b=c;
	    	System.out.print(c);
			
		}
	}
}
//
// 0112358