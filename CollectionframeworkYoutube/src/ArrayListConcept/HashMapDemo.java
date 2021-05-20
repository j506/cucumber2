package ArrayListConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> l=new HashMap<String,String>();
		l.put("India", "New Delhi");
		l.put("Usa","Washngton dc");
		l.put("Uk","London");
		
		//Iterator:over the keys-by using keyset
		Iterator<String> key=l.keySet().iterator();
		while(key.hasNext())
		{
			String t=key.next();
			String r=l.get(t);
			System.out.println("keys:"+t+"=="+"values:"+r);
		}
		//iterator:over set(pairs):by using entyset
	    Iterator<Entry<String, String>> it1=l.entrySet().iterator();
	    while(it1.hasNext())
	    {
	    	Entry<String,String> keys=it1.next();
	    	System.out.println("keys:"+keys.getKey()+"==="+"values:"+keys.getValue());
	    }
	    //iterator:can traverse using java 8 and lambda
	    l.forEach((k,v)->System.out.println("keys:"+k+"==="+"values:"+v));
		

	}

}
