class News
{
	void news()
	{
	 int i=-3, j=2, k=0, m;
    m = ++i && ++j || ++k;
    System.out.println(+ i+ " "+j+ " " +k+ " "+m);
	}
	public static void main(String args[])
	{
	News n=new News();
	n.news();
    }
}