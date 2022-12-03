class Array
{
	void asdf()
	{
        int a=10,b=0;
		System.out.println("statement before exception");
       try
	   {
		   try
	       {	 
		   int c=a/b;
	        System.out.println(c);
	        }
	      catch(ArithmeticException ae)
	      {
		System.out.println(ae);   
	     }
		  int c=a+b;
	   System.out.println(c);
	   }
	   
	   catch(NumberFormatException ae)
	   {
		   System.out.println(ae);
		   
	   }
	   
	   catch(Exception ae)
	   {
		   System.out.println(ae);
	   }
	  
	   System.out.println("statement after exception");
	}	   
	public static void main(String args[])
	{
			Array b=null; 
			b=new Array();
		  int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		
		System.out.println(a[i]);
		}
		b.asdf();
			}


}