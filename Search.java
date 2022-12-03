import java.util.Scanner;
class Search


{
	public static void main(String []args)throws Exception
	{
          int flag;
       int a[]={23,34,12,56,78};
		   for(int i=0;i<5;i++)
	    {
			int s;
             Scanner kb=new Scanner(System.in);
              a[4]=kb.nextInt();			 
			  s=kb.nextInt();
			System.out.println("enter the number to be searched"+s);
			
			flag=0;
		   if(a[i]==s)
			   
		   {
	   System.out.println("number found");
		   }
	   else
	   System.out.println("number not found");
	   {}
	}
}
}