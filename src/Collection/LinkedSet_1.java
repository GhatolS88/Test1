package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class LinkedSet_1 
{	
	//Duplicates not allowed
	//only one null value accept
	//no default capacity
	//order of insertion is random
	//data structure is hybrid(linear+hashtable)
	//storage type hashtable
	//
	public static void main(String[] args)
	{	
		LinkedHashSet  LHS=new LinkedHashSet();
		 
		//add information
		LHS.add("Sonali");
		LHS.add(100);
		LHS.add('G');
		LHS.add(23.34f);
		LHS.add(null);
		LHS.add(100);
		
		System.out.println(LHS);
		
		//verify size
		System.out.println(LHS.size()); //5
		//Verify object is empty or not
		System.out.println(LHS.isEmpty()); //false
		//verify information present or not
		System.out.println(LHS.contains(100)); //true
		
		//remove information
		LHS.remove(100);
		System.out.println(LHS);
		
		System.out.println("----------for each loop----------");
		
		for(Object S1:LHS)
		System.out.println(S1);	
		
		System.out.println("--------Iterator cursor-----------");
		
		Iterator  itr=LHS.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
