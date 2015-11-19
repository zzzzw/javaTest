package Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashMapTestArrayList {
	public static void  main(String args[])
	{
		
		HashMap<String,String> hasmap=new HashMap<String,String>(); 
		hasmap.put("name", "zengzhiwei");
		hasmap.put("age", "23");
		hasmap.put("sex", "boy");
		List<HashMap<String,String> > lists=new ArrayList<HashMap<String,String> >();
		lists.add(hasmap);
		HashMap<String,String> hasmap1=new HashMap<String,String>(); 
		hasmap1.put("name1", "zengzhiwei");
		hasmap1.put("age1", "23");
		hasmap1.put("sex1", "boy");
		lists.add(hasmap1);
		for(HashMap<String,String>  list:lists){
			Set set=list.keySet();
			for(Object key:set){
				System.out.println(key);
				System.out.println(list.get(key));
			}
		
		}
		Iterator<HashMap<String,String>> ite=lists.iterator();
		while(ite.hasNext())
		{
			HashMap has=ite.next();
			
			System.out.println("9999999999999999999999999");
			System.out.println(has.keySet());
			for(Object st:has.keySet())
				System.out.println(has.get(st));
		}
		
		
	}

}
