import java.util.Scanner;
class Prime
{
	 public static void main(String []args)
	 {
		 Scanner kb=new Scanner(System.in);
		 int i;
		 System.out.println("enter the number");
		 int n=kb.nextInt();
		 /*for(i=0;i<=n;i++)*/
		 
		 if(n%2==0)
			 {
				 System.out.println("prime number");
			 }	 
		
		 else
		 {
			 System.out.println("not prime");
		 }
	  
	 } 
}