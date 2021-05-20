package ui;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		//basically we want to add all the elements in the arraylist into a new arraylist
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		al_dup.removeAll(al);
		System.out.println(al_dup);
		//sort-collections.sort()
		Collections.sort(al);
		System.out.println("Elements in arraylist after sort using aollection class method:"+al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("sort the elements in arraylist in reverse order:"+al);
		//Shuffling-Collections.shuffle();
		System.out.println("Elements in the arraylist in suffle");
		Collections.shuffle(al);
		System.out.println("Elements in the arraylist in suffle:"+al);
		

	}

}
