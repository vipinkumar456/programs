class Abstract
{
	Abstract()
{
	System.out.println("this is a phone");
}
	
	void calling()
	{
	  System.out.println("phone have calling facility");
	}
	void ram()
	{
	  System.out.println("phone have 1g 	ram");
	}
	
     void rom()
	{
	 

	  System.out.println("phone have 32 gb rom");
	}

	public static void main(String[] args)
	{
	  Abstract p=new Abstract();	
	p.calling();p.ram();p.rom(); 
	}
}