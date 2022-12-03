import java.util.Scanner;
class Celsious
{
	public static void main(String args[])
	{		
			float a;
			System.out.println("enter the number");
			Scanner kb=new Scanner(System.in);
			a=kb.nextFloat();
			a=((a-32)*5)/9;
			System.out.println("" +a);
	}
}