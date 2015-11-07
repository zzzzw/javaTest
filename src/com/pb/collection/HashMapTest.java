package com.pb.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//by zengzhiwei
public class HashMapTest {
	public static void main(String args[])
	{
		//定义一个HashMap（Map接口的实现类）来存放对象
		Map<String,String> hasMap=new HashMap<String,String>();
		//put("key","value"); 一个key对应一个value		
		hasMap.put("name", "zengzhiwei");
		hasMap.put("age","20");
		hasMap.put("sex", "boy");
		System.out.println("hasMap.isEmpty："+hasMap.isEmpty());//判断这个HashMap是否为空
		System.out.println(""+hasMap.entrySet()); //entrySet，是[sex=boy, age=20, name=zengzhiwei]
		System.out.println(""+hasMap.values());//返回value对象集;[boy, 20, zengzhiwei]
		System.out.println(""+hasMap.keySet());//返回[sex, age, name]
		//通过entryset来遍历
		Iterator iterator=hasMap.entrySet().iterator();//set集才可以使用Iterator方法遍历
		while(iterator.hasNext())//遍历器时候还有下一个参数
		{
			Object key=iterator.next();//定义一个对象来接受遍历的每一个对象
			System.out.println(key.toString());//用String方式输出
		}
		//通过keySet来遍历
		Iterator it1=hasMap.keySet().iterator();
		while(it1.hasNext())
		{
			String key1=(String)it1.next();
			System.out.println("has.get()方式:"+hasMap.get(key1));
			
		}
		//定义一个set集，指定参数类型是Entry<String,String>
		Set<Entry<String,String>> sets=hasMap.entrySet();
		for(Entry<String,String> res:sets)//另外一种遍历方式
		{
			System.out.println("res.getkey():"+res.getKey());
			System.out.println("res.getValue():"+res.getValue());
		}
		//除了Iterator的方式，还可以用set的方式来遍历keySet遍历
		Set<String> result=hasMap.keySet();
		for(String result1:result){
			System.out.println("hasMap.get():"+hasMap.get(result1));
		}		
	}
	
}
