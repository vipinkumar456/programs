import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
	int l,b;
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the length of rectangle");
	 l=kb.nextInt();
	System.out.println("enter the breath  of rectangle");
	 b=kb.nextInt();
	 int a=l*b;
	 System.out.println(a);
	}
}