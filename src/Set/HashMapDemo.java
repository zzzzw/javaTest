package Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static  void main(String args[])
	{
		HashMap<String,String> hasmap=new HashMap<String,String>();
		hasmap.put("name", "zengzhiwei");
		hasmap.put("age", "22");
		hasmap.put("sex", "boy");
		Iterator a=hasmap.keySet().iterator();
		while(a.hasNext())
		{
			Object c=a.next();
			String result=c.toString();
			System.out.println(c);
			System.out.println(hasmap.get(c));
			
		}
		Set<Entry<String,String>> sets=hasmap.entrySet();
		for(Entry<String,String> set:sets)
		{
			System.out.println("--------------------");
			System.out.println(set.getKey());
			System.out.println(set.getValue());
			
			
		}
	}

}
