package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaCollection {

	public static void main(String[] args) {
		// declare an arrayList
		//ArrayList al=new ArrayList();
		//suppose we want to add some homogenious data
		//ArrayList<String> al=new ArrayList<String>();
		//List l=new ArrayList();
		ArrayList al=new ArrayList();
		//Add new element in arraylist
		al.add(100);
		al.add("jagannath");
		al.add('A');
		al.add(15.5);
		al.add(true);
		System.out.println(al);
		System.out.println("No of elments are present inseide the arraylist"+al.size());
		//remove an elements in arraylist
		al.remove(1);
		//al.remove("jagannath");
		System.out.println("remove the elements in the arraylist:"+al);
		//insert an elements into the arraylist
		//add(index,object)
		al.add(2,"python");
		System.out.println("After insert an element into the arraylist:"+al);
		
		//retrieving specific element into the arraylist
		System.out.println(al.get(2));
		//change elements/replace
		al.set(2, "c#");
		System.out.println("After replacing ana elements into the arraylist:"+al);
		//search-contains()
		System.out.println(al.contains("c#"));
		//isempty()
		System.out.println(al.isEmpty());
		//i want to retrieve all the eleents from the arraylist,so there are multiple ways
		//for loop
		System.out.println("Read the elementsusing for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//for..each loop
		System.out.println("Reading all the elements into the arraylist using for each loop");
		for(Object e:al)
		{
			System.out.println("elements inside the allaylist:"+e);
		}
		//iterator()
		System.out.println("Reading all the elements in arraylist using iterator()");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
