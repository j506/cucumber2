package ui;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an arraylist
	    ArrayList arrlist=new ArrayList();
	    arrlist.add(23);
	    arrlist.add("jagannath");
	    arrlist.add('t');
	    arrlist.add(12.00);
	    System.out.println(arrlist);
	    ArrayList<Integer>arlist=new ArrayList<Integer>();
	    arlist.add(20);
	    arlist.add(30);
	    arlist.add(40);
	    arlist.add(40);//duplicates are allowed
	    System.out.println(arlist);
	    //Access an elements in an arraylist
	    System.out.println(arlist.get(2));
	    System.out.println(arlist.get(3));
	    System.out.println(arlist.get(1));
	    System.out.println(arlist.get(0));
	    //update an elements in an arraylist
	    System.out.println(arlist.set(0, 21));
	    System.out.println(arlist);
	    //count elements in the arraylist
	    System.out.println(arlist.size());
	    //remove elements 
	    System.out.println(arlist.remove(0));
	    //insert element in between 
	    arlist.add(1, 24);
	    System.out.println(arlist);
	    //Traverse(iterate) elements in an arraylist
	    //1.for loop
	   // for(int i=0;i<arlist.size();i++)
	   // {
	    	//System.out.print(arlist.get(i));
	    //	System.out.print(",");
	    	
	    //}
	    //using iterator
	    Iterator itr=arlist.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next());
	    	System.out.print(" ");
	    }
	    

	}

}
