package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> s=new ArrayList<Integer>(Arrays.asList(10,20,20,30,30,40,50,60,70,80,90));
		//using the linkedHashSet
		LinkedHashSet<Integer> removeduplicates=new LinkedHashSet(s);
		ArrayList<Integer> a=new ArrayList<Integer>(removeduplicates);
		System.out.println(a);
        //java JDK-8 stream;
		List<Integer>distinctelemnt=s.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctelemnt);
		
		
	}

}
