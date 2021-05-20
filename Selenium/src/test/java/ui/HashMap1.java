package ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> phonebook=new HashMap<String, String>();
		phonebook.put("Jagannath", "8383833383");
		phonebook.put("haajjaj", "939399393");
		System.out.println(phonebook);
		System.out.println(phonebook.get("Jagannath"));
		Set<String> keys=phonebook.keySet();
		for(String i:keys)
		{
			System.out.println(phonebook.get(i));
		}
		Set<Map.Entry<String,String>> values=phonebook.entrySet();
		for(Map.Entry<String,String> e:values)
		{
			System.out.println(e.getKey()+"-"+e.getValue());
			
		}

	}

}
