abstract class Anonymous
{
	abstract void eat();
	
}
class person
{
public static void main(String args[])
{
		Anonymous a=new Anonymous()
		{
		void eat()
		{
		System.out.println("nice fruits");
		}
		};
		a.eat();
}
}
