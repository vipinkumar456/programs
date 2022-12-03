abstract class Vehicle
{
	abstract void start();
	void vehicle()
	{
	System.out.println("this is a vehicle");
	}
}
class Bike extends Vehicle
{
	void start()
	{
	System.out.println("this is start");
}
	public static void main(String args[])
	{
		Bike r=new Bike();
		r.start();r.vehicle();
	}
	
	
}
class Car extends Vehicle
{
	void start()
	{
	System.out.println("this is start");
}
	public static void main(String args[])
	{
		Car c=new Car();
		c.start();
		c.vehicle();
	}
}	