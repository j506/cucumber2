package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HahMap does not maintain order or indexing
		//Store the value in the form of key and value pair format<k,v>
		//key can not br duplicate
		//can store n number of null value but only one null key
		//HashMap is not thread-safe-unsenchronized
		HashMap<String,String> capitalMap=new HashMap<String,String>();
		//i want to store the values inside the keys
		capitalMap.put("INDIA","New Delhi");
		capitalMap.put("USA","Washnigton DC");
		capitalMap.put("UK", "London");
		capitalMap.put(null, "Bernil");
		capitalMap.put("Russia", null);
		capitalMap.put("Iceland", null);
		capitalMap.remove("Iceland");
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Germany"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		System.out.println(capitalMap.get("Iceland"));
		//iterator:over the keys:by using keyset()
		Iterator<String> it=capitalMap.keySet().iterator();//taht will return one key set
		while(it.hasNext())
		{
			String key=it.next();
			String value=capitalMap.get(key);
			System.out.println("key:"+key+"========= "+ "value:"+value);
		}
		//iterator:over the set(pairs):by using entryset()
		Iterator<Entry<String, String>> it1=capitalMap.entrySet().iterator();//we have to store entire key value pair data inside the hashmap with the help of entry class over there and the entry class is generics in the form of string,string
		while(it1.hasNext())
		{
			Entry<String,String> entry=it1.next();
			System.out.println("keys:"+entry.getKey()+"="+"value:"+entry.getValue());
			
		}
		//iterate hashmap using java 8 for each and lambda
		capitalMap.forEach((k,v)->System.out.println("key:"+k+"==="+"value:"+v));
		
		

	}

}
