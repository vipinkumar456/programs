class Smartphone extends Phone
{
	void SmartPhone()
	{
	System.out.println("this is a smart phone");
	}
	void SmartPhone(int inch)
	{
	System.out.println("this is a "+inch+" inch");
	}
	void fm()
	{
	 System.out.println("this has a fm");
	}
	 void ram()
	{
		System.out.println("this has 32 gb rom");
	}
	void rom()
	{
	 
	  System.out.println("phone have 64 gb rom");
	}
	void camera()
	{
	 System.out.println("this has a camera");
	}
		public static void main(String args[]){
		Smartphone s=new Smartphone();
		s.rom();
		
	}

}