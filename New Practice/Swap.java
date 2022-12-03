import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=kb.nextInt();
		System.out.println("enter the value of b");
		b=kb.nextInt();
		
		c=a;
		a=b;
		b=c;
		// a=a+b;,
		// b=a-b;
		 // a=a-b;
		 System.out.println("value after swapping");
		 System.out.println("a:"+a);
		 System.out.println("b"+b);
		
	}
}
