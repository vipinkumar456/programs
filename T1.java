class T1 implements Runnable
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
		T1 obj=new T1();
		Thread t = new Thread(obj);
		t.start();
	}
}1