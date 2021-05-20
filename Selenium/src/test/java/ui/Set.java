package ui;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> values=new TreeSet<Integer>();
		System.out.println(values.add(3));
		System.out.println(values.add(4));
		System.out.println(values.add(5));
		System.out.println(values.add(4));
		for(int i:values)
		{
			System.out.println(i);
		}

	}

}
