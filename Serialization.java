import java.io.*;
class Serialization

{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		FileOutputStream fileout;
		Employee e=new Employee();
		e.empid=1000;
		e.ename="vipin";
		E.eaddress="a";
		e.ephone=888;
		fileout=new FileOutputStream("emp.ser");
		ObjectOutputStream obj=new ObjectOutputStream(fileout);
		obj.writeObject(e);
		System.out.println("serialized succesfully");
		
	}
}