package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set
{	
	//duplicates not allowed
	//order of insertion maintanined:-ascending order
	//not accept null value
	//Storage type:-hashtable
	//data structure:- balanced tree
	//no default capacity
	//Note:-we can store only homogeneous information
	
	public static void main(String[] args)
	{	
		TreeSet  Tr=new TreeSet();
		//add information
		
		Tr.add(100);
		Tr.add(400);
		Tr.add(300);
		Tr.add(200);
		Tr.add(500);
		Tr.add(600);
		
		System.out.println(Tr);
		
		//* duplicate not allowed --Tr.add(100)
		//*null value not allowed
		
		//size
		System.out.println(Tr.size());
		
		//verify information present or not
		System.out.println(Tr.contains(400));
		
		//object is empty or not
		System.out.println(Tr.isEmpty());
		
		//remove information
		Tr.remove(500);
		System.out.println(Tr);
		
		//print first information
		System.out.println(Tr.first());
		
		//print last information
		System.out.println(Tr.last());
		
		//remove first information
		
		Tr.pollFirst();
		System.out.println(Tr);
		
		//remove last info
		Tr.pollLast();
		System.out.println(Tr);
		
		System.out.println("---------for each loop-----------");
		
		for(Object S1:Tr)
			System.out.println(S1);
		
		System.out.println("------------Iterator--------------");
		
		Iterator itr=Tr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
