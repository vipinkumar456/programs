class Str1
{
	void asf()
	{
	String s=new String("abc@gmail.com");
	String s2=new String("Abc@gmail.com");
	System.out.println(s.length());
	System.out.println(s.charAt(2));
	System.out.println(s);
	System.out.println(s.indexOf("l"));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.substring(	4,8));
	System.out.println(s.trim());
	System.out.println(s.equals(s2));
	}
	public static void main(String args[])
	{
	new Str1().asf();
	}
}