package Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class Test1
{	
	public static void main(String[] args)
	{
		ArrayList  al=new ArrayList();
		
		al.add("Sonali");
		al.add(100);
		al.add('A');
		al.add(12.34f);
		al.add(100);
		al.add(null);
		al.add(null);
		
	    Iterator   itr=al.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
		
		
	}

}
