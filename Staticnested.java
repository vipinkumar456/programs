class Staticnested
{	
	static int data=30;
	static class Inner
	{
		void msg()
		{
			System.out.print(data);
		}
	}
	public static void main(String args[])
	{
		Staticnested.Inner s=new Staticnested.Inner();
		s.msg();
	}
	
}