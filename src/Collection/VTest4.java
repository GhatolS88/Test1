package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VTest4
{	
	//Duplicates are allowed
	//any no of null value allowed
	//oder of insertion is maintained
	//storage type=index
	//data structure=double
	//incremental capacity=(current capacity*2)
	//default capacity is 10
	//vector is the legacy class
	
	public static void main(String[] args)
	{	
		Vector  V1=new Vector();
		
		V1.add("Sonali");
		V1.add(20);
		V1.add('A');
		V1.add(45.56f);
		V1.add(20);
					
	System.out.println(V1);
	
	//Verify vector is empty or not
	System.out.println(V1.isEmpty());
	
	//SiZe or capacity
	System.out.println(V1.size());
	
	//Verify information present or not
	System.out.println(V1.contains("Sonali"));
	
	//add information in between vector--->Reight Shift
	V1.add(4,300);
	System.out.println(V1);
	
	//remove information
	V1.remove(4);
	System.out.println(V1);
	
	//update info
	V1.set(1, 45);
	System.out.println(V1);
	
	//to find index of data
	System.out.println(V1.indexOf("Sonali"));
	
	//To get the index by providing information
	 System.out.println(V1.get(0));
	 
	 System.out.println("----------for each loop-----------");
	 for(Object VEC:V1)
		 System.out.println(VEC);
	 
	 System.out.println("----------Iterator cursor------------");
	 Iterator  itr=V1.iterator();
	 while(itr.hasNext())
	 {
	 System.out.println(itr.next());
	 }
	 
	 System.out.println("--------ListIterator cursor--------");
	 
	 ListIterator List=V1.listIterator();
	  
	 while(List.hasNext())
	 {	
		 System.out.println(List.next());
	 }
	 
	 System.out.println("-------Enumeration cursor--------");
	 
	 Enumeration ENU=V1.elements();
	 while(ENU.hasMoreElements())
	 {
		 System.out.println(ENU.nextElement());
	 }
	
		
		
		
		
	}

}
