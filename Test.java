interface Vehicle
{
	void wheels();
	void brakes();

}
interface Veh
{
	void engine();
}
class  Car implements Vehicle,Veh
{
	public void wheels()
	{
		System.out.println("4 wheels");
	}
	public void brakes()
	{
	System.out.println("dish brakes");
	}
	public void engine()
	{
	System.out.println("1 engine");
	}
	public static void main(String args[])
	{
      Car c =new Car();
	c.show();c.display();
	}
}