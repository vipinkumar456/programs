import java.io.*;
class Deserialization
{
	public static void main(String args[])
	{
		Employee e=null;
		FileInputStream filein=new FileInputSteam("emp.ser");
		ObjectInputStream obj=new ObjectInputStream(filein);
		e=(Emplpoyee)obj.readObject();
		System.out.println(e.empid+" "+e.ename+" "+e.eaddress+" "+e.ephone);
	}
}