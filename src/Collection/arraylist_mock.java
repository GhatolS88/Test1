package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist_mock
{	
	

	public static void main(String[]args)
	{
	  // declare object of arraylist

	 ArrayList  al=new   ArrayList();

	//add imformation
	al.add("akshayini");
	al.add(100);
	al.add('A');
	al.add(23.13f);
	al.add(100);
	al.add(null);
	al.add(null);

	//to  get siza
	System.out.println(al.size());
	//to find object is empty or not
	System.out.println(al.isEmpty());
	//contains present or not
	System.out.println(al.contains('A'));
	//aad info
	al.add(4,200);
	System.out.println(al);
	//remove info
	al.remove(4);
	System.out.println(al);
	//update info
	al.set(0,"sonali");

	System.out.println(al);
	//find index
	System.out.println(al.indexOf('A'));
	//to get info by providing index
	System.out.println(al.get(0));

	System.out.println("-----for each loop--------");
	for(Object S1:al)
	{
	   System.out.println(S1);
	}

	System.out.println("----Iterator---");

	Iterator  itr=al.iterator();

	while(itr.hasNext())
	{
	  System.out.println(itr.next());
	}

	System.out.println("----------------ListIterator--------------");

	ListIterator   list=al.listIterator();
	while(list.hasNext())
	{
	  System.out.println(list.next());
	}

	  }
	}


