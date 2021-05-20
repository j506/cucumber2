package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> studentnames=new ArrayList<String>();
		studentnames.add("jagananth");//index=0
		studentnames.add("raju");//index=1
		studentnames.add("hari");//index=2
		studentnames.add("steve");//index=3
		
		//Now i want to iterate the values
		//Typical forloop
		for(int i=0;i<studentnames.size();i++)
		{
			System.out.println(studentnames.get(i));
		}
		System.out.println("_______");
		//typical for eachloop
		for(String s:studentnames)
		{
			System.out.println(s);
		}
		System.out.println("-----------");
		//java-8 streams with lambda:
		studentnames.stream().forEach(ele ->System.out.println(ele));
		//iterator
		System.out.println("----");
		Iterator<String> it=studentnames.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//List with other collection
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		//for each loop 
		for(int i:numbers)
		{
			System.out.println(i);
		}
    //    System.out.println(arr[-1]) //ArrayIndexOutOFBounDException
		numbers.stream().forEach(ele->System.out.println(ele));
		Iterator<Integer> it1=numbers.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
