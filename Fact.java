import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
	System.out.println("enter the number");
	     int num=kb.nextInt();
		 int i,fact=1;
		 for(i=1;i<=num;i++)
		 {
			 fact=fact*i;
		 }
		System.out.println(fact);
	}
	
}