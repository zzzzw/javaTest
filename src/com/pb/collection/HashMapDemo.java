package com.pb.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String args[]){
		HashMap<String,String> hasMap=new HashMap<String,String>();
		hasMap.put("cn", "中国");
		hasMap.put("jp", "法国");
		hasMap.put("fr", "法国");
		
		System.out.println("hasMap");
		System.out.println("cn:"+hasMap.get("cn"));
		System.out.println("hasMap.containsKey:"+hasMap.containsKey("cn"));
		System.out.println("hasMap.keySet:"+hasMap.keySet());
		System.out.println("hasMap.isEmpty:"+hasMap.isEmpty());
		
		hasMap.remove("cn");
		System.out.println("hasMap.containsKey:"+hasMap.containsKey("cn"));
		
		//采用Itertator遍历HashMap
		Iterator it=hasMap.keySet().iterator();
		while(it.hasNext()){
			String key=(String)it.next();
			System.out.println("key:"+key);
			System.out.println("value:"+hasMap.get(key));		
		}
		
		//遍历HashMap的另外一个方法，用一个set来装
		System.out.println("hasMap.keySet"+hasMap.keySet());
		System.out.println("hasMap.value:"+hasMap.values());
		System.out.println("hasMap.entrySet:"+hasMap.entrySet());
		Set<Entry<String,String>> sets=hasMap.entrySet();
		for(Entry<String,String> entry:sets){
			System.out.println("entry.getKey():"+entry.getKey()+",");
			System.out.println("entry.getValue："+entry.getValue());
		}	
	}
}
