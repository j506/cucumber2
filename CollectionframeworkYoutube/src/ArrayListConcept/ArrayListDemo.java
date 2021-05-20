package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arraylist is the default class in java
		//behave like a dynamic array also
		//three way for declaring array list
		//default generics
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add("jagannath");
		ar.add(23.445);
		ar.add('t');
		ar.add(true);
		System.out.println(ar);
		//but this isthe raw type of data java donot prefer the way to store data rather we can give the data in the generic way
		ArrayList<Object> ar1=new ArrayList<Object>();
		ar1.add(100);
		ar1.add(200);
		ar1.add("jagannath");
		ar1.add(23.445);
		ar1.add('t');
		ar1.add(true);
		System.out.println(ar1);
		System.out.println(ar1.get(2));
		//add is the method is used to add the value into the ararylist and the reason the arraylist is the ordered preserved
		//then we can get the specific value in the arraylist  using get method 
		System.out.println(ar1.size());
		System.out.println("l1"+0);
		System.out.println("l2"+(ar1.size()-1));
		ar1.add(600);
		ar1.add("raju");
		System.out.println(ar1.size());

	}

}
