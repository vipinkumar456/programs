import java.io.*;
class Serializable
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		FileOutputStream fileout;
		Employee e=new Employee();
		e.empid=1000;
		e.eaddress="a";
		e.ename="vipin";
		e.ephone=888;
		fileout=new FileOutputStream("emp.ser");
		ObjectOutputStream obj=new ObjectOutputStream(fileout);
		obj.writeObject(e);
		System.out.println("serialized succesfully");
		
	}
}