class ThreadExample
{ 

		public static void main(String args[])//throws InterruptedException	
		{
		ThreadExample1 te1=new ThreadExample1();
		Thread t1=new Thread(te1);
		Thread t4=new Thread(te1);
		t1.setPriority(Thread.MAX_PRIORITY);
		ThreadExample2 te2=new ThreadExample2();
		Thread t2=new Thread(te2);
		t2.setPriority(Thread.NORM_PRIORITY);
		ThreadExample3 te3=new ThreadExample3();
		Thread t3=new Thread(te3);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		}

}