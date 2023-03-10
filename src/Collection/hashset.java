package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset
{	
	//duplicates not allowed
	//accept only one null value 
	//order of insertion random/maintained ascending order
	//storage type:-Hashtable
	//data structure is Hashtable:- it contained key and value format
	//no default capacity
	public static void main(String[] args)
	{
		HashSet  HS=new HashSet();
		
		//Add information
		HS.add("Tina");
		HS.add(50);
		HS.add(13.34f);
		HS.add('D');
		HS.add(50);
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS);
		
		//verify size
		System.out.println(HS.size());  //5
		
		// verify object empty or not
		System.out.println(HS.isEmpty());//false
		
		//verify information present or not
		System.out.println(HS.contains("Tina")); //true
		
		//remove information
		HS.remove('D');
		System.out.println(HS);
		
		System.out.println("-------------for each loop-------");
		for(Object H1:HS)
		{
			System.out.println(H1);
		}
		
		System.out.println("---------------Iterator cursor-------------");
		Iterator  itr=HS.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
