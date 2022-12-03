import java.io.*;
class Buffer
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("enter the number");
		int roll=Integer.parseInt(br.readLine());
		System.out.println("enter the name of the code");
		String name=br.readLine();
		System.out.println("enter the section");
		char ch=(char)br.read();
		System.out.println(roll+" "+name+" "+ch);
		
	}
	
}