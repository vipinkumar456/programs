import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
	   int a,b,c;
	   System.out.println("enter the value of a");
	    a=kb.nextInt();
	   System.out.println("enter the value of b");
	    b=kb.nextInt();
		System.out.println("enter the value of c");
	    c=kb.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
	
	
}