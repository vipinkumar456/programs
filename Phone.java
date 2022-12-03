abstract class Phone
{

	
	abstract void ram();
	
     void rom()
	{
	 

	  System.out.println("phone have 32 gb rom");
	}
}
class B extends Phone
{
		void ram()
		{
			System.out.println("32 gb ram");
		}

	public static void main(String args[])
	{
			B a=new B();
	    a.ram();a.rom();
	}
}