package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo1
{	
	public static void main(String[] args)
	{
		ArrayList  al=new ArrayList();
		//Add Information
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(34.25f);
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		//Verify arraylist is empty or not
		System.out.println(al.isEmpty());    //false
		//size or Capacity
		System.out.println(al.size());  //7
		//Verify informtaion is present or not
		System.out.println(al.contains('A')); //true
		//Add information inbetween Arraylist-->Right shift operation
		     al.add(3,50);
		     System.out.println(al);
		//remove information-->Left shift operation
		al.remove(3);
		System.out.println(al); 
		//update info
		al.set(3, 56.455);
		System.out.println(al);
		//to find index of data
		System.out.println(al.indexOf('A'));  //2
			
		//to get index by providing information
		System.out.println(al.get(0));  //Rahul

		System.out.println("--------For each loop-------------");
		
		for(Object S1:al)  //0--->Rahul  1-->100 2-->A  3--->34.25  4-->100
			
			System.out.println(S1);  //
		
		System.out.println("--------Iterator-----------");
		
		Iterator  itr=al.iterator();
		
		while(itr.hasNext())      // 7-------->false
		{
			System.out.println(itr.next());  // Rahul  100 A 34.25  100 null null
			
		}
		 System.out.println("-------ListIterator----------");
		 
		 ListIterator  List=al.listIterator();
		 
		 while(List.hasNext())   // 7--->false
		 {
			 System.out.println(List.next());//  Rahul  100  A  60.45  100 null null
		 }
	
		
		
		
		
	}

}



