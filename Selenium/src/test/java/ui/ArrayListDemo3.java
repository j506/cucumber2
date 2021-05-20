package ui;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Dog","cat","elephant"};
		for(String value:arr)
		{
			System.out.println(value);
		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
