import java.util.Date;
class ThreadExample3 implements Runnable
{
	String str[]={"badrapur", "faridabd", "sarai", "nhpc", "old faridabad"};
    public	void run()
	{
		for(int i=1;i<=5;i++)
		{
			//Date d = new Date();
	System.out.println(str[i]);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
		}
		
	}
}