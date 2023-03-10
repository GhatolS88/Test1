package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Link_Test4
{	  
	 //Duplicates are allowed 
	 //any no of null value allowed
	//order of insertion maintained
	//storage type=index
	//no default capacity
	//data structure=linear
	public static void main(String[] args)
	{	
		LinkedList  L1=new LinkedList();
		
		//Add information
		L1.add("Sonal");
		L1.add(100);
		L1.add('B');
		L1.add(34.12f);
		L1.add(null);
		L1.add(null);
		L1.add(100);
		
		System.out.println(L1);
		
		//To get size
		System.out.println(L1.size());  //7
		//verify the contained
		System.out.println(L1.contains("Sonal")); //true
		//verify the object is empty or not
		System.out.println(L1.isEmpty());    //false
		//Add information in between LinkList--->Right shift
		L1.add(1,200);
		System.out.println(L1);
		//Remove information  ---->left shift
		L1.remove(1);
		System.out.println(L1);
		//update
		L1.set(3,56.67f);
		System.out.println(L1);
		//find index
		System.out.println(L1.indexOf("Sonal"));  //0
		//to get the index by providing information
		System.out.println(L1.get(0));
		
		System.out.println("------for each loop------"); 
		
		//For each loop
		
		for(Object S1:L1)
			System.out.println(S1);
		System.out.println("--------Iterator Cursor----");
		
		Iterator  T1=L1.iterator();
		
		while(T1.hasNext())
		{
			System.out.println(T1.next());
		}
		
		System.out.println("-------Listiterator Cursor-------");
		
		ListIterator  List=L1.listIterator();
		
		while(List.hasNext())
		{
		    System.out.println(List.next());
		}
		
	
		
		
		
		
		
	}

}
