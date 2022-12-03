	class ThreadExample2 implements Runnable
{
    public	void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("station is"+"  ");
			try
			{
				Thread.sleep(1000+20);
			}
			catch(Exception e)
			{}
		}
		
	}
}