package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompariosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sort and then equals
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		//compare twolist and find out the additional elements
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		l4.removeAll(l5);
		System.out.println(l4);
		//findout the all missing elements in l4
        l5.removeAll(l4);
		System.out.println(l5);
		//findout the common elelnts are present into two list
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("java","python","ruby","c#","php"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("java","python","ruby","c#",".net"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);

	}

}
