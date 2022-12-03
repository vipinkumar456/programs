class ThreadExample1 implements Runnable
{
    public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
		}
	}
	public static void main(String args[])
	{
		ThreadExample1 te=new ThreadExample1();
		Thread t = new Thread(te);
		t.start();
	}
}