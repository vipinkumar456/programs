package collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Collections
{
	public static void main(String args[])
	{
	List<Integer> list=new ArrayList<>();
	list.add(1);
    list.add(2);
	list.add(3);
	System.out.println("Before swapping the list is"+list);
	Collections.reverse(list);
	System.out.println("after swapping the list is"+list);
	}
}