package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("devops");
		
		//ar1.addAll(ar2);
		//System.out.println(ar1);
		//ar1.addAll(2, ar2);
		//System.out.println(ar1);
		//ar1.clear();
		//System.out.println(ar1);
		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("python"));
		System.out.println(ar1.contains("c"));
		System.out.println(ar1.indexOf("ruby")>0);
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("jagannath","jagannath","hari","halu","talu","jagannath"));
		System.out.println(list1);
		int i=list1.lastIndexOf("jagannath");
		System.out.println(i);
		System.out.println(list1.remove(1));
		System.out.println(list1);
		list1.remove("talu");
		System.out.println(list1);
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num->num%2==0);
		System.out.println(numbers);
		ArrayList<String> nameList=new ArrayList<String>(Arrays.asList("jagannath","hari","tom","tom","tom"));
		System.out.println(nameList);
		nameList.retainAll(Collections.singleton("tom"));
		System.out.println(nameList);
		ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60));
		ArrayList<Integer> subList=new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);
		ArrayList<String> newList=new ArrayList<String>(Arrays.asList("jagannath","raju","hari","rama"));
		Object[] arr=newList.toArray();
		System.out.println(Arrays.toString(arr));
	    for(Object r:arr)
	    {
	    	System.out.println((String)r);
	    }
		
		
		
	}

}
