class Thread
{
	void asdf()
	{
			for(int i=65;i<=74;i++)
			{
				System.out.println((char)i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					
				}
			}
	}
	public static void main(String args[])
	{
	Thread t=new Thread();
	t.asdf();
	}
}