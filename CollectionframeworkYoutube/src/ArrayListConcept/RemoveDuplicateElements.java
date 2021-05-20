package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,4,5,6,7,8,9,10,10,20,30));
		//1.Linkedlist
		LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numberlistwithoutduplicate=new ArrayList<Integer>(linkedhashset);
		System.out.println(numberlistwithoutduplicate);
		//JDK-8-stream()
		ArrayList<Integer> markList=new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,4,5,6,7,8,9,10,10,20,30));
		List<Integer>marksListUnique=markList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		
		
		
		
		

	}

}
