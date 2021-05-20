package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collections.synchronizedList
		List<String> newList=Collections.synchronizedList(new ArrayList<String>());
		newList.add("jagannath");
		newList.add("raju");
		newList.add("rani");
		newList.add("rama");
		
		//add,remove operation -we donot need explicit Synchronization
		//to fetch/traverse the value from the list we have to use explicit Synchronization 
		synchronized(newList)
		{
			Iterator<String> it=newList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		//2.copyonwriteArrayList-it is a class
		CopyOnWriteArrayList<String> emplist=new CopyOnWriteArrayList<String>();
		emplist.add("jagananth");
		emplist.add("raju");
		emplist.add("rana");
		emplist.add("taal");
		//we donot nee explixt synchronization for qny appliacation:add/remove/travese
		Iterator<String> it1=emplist.iterator();
	    while(it1.hasNext())
	    {
	    	System.out.println(it1.next());
	    }

	}

}
