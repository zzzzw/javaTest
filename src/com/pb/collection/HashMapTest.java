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
		//����һ��HashMap��Map�ӿڵ�ʵ���ࣩ����Ŷ���
		Map<String,String> hasMap=new HashMap<String,String>();
		//put("key","value"); һ��key��Ӧһ��value		
		hasMap.put("name", "zengzhiwei");
		hasMap.put("age","20");
		hasMap.put("sex", "boy");
		System.out.println("hasMap.isEmpty��"+hasMap.isEmpty());//�ж����HashMap�Ƿ�Ϊ��
		System.out.println(""+hasMap.entrySet()); //entrySet����[sex=boy, age=20, name=zengzhiwei]
		System.out.println(""+hasMap.values());//����value����;[boy, 20, zengzhiwei]
		System.out.println(""+hasMap.keySet());//����[sex, age, name]
		//ͨ��entryset������
		Iterator iterator=hasMap.entrySet().iterator();//set���ſ���ʹ��Iterator��������
		while(iterator.hasNext())//������ʱ������һ������
		{
			Object key=iterator.next();//����һ�����������ܱ�����ÿһ������
			System.out.println(key.toString());//��String��ʽ���
		}
		//ͨ��keySet������
		Iterator it1=hasMap.keySet().iterator();
		while(it1.hasNext())
		{
			String key1=(String)it1.next();
			System.out.println("has.get()��ʽ:"+hasMap.get(key1));
			
		}
		//����һ��set����ָ������������Entry<String,String>
		Set<Entry<String,String>> sets=hasMap.entrySet();
		for(Entry<String,String> res:sets)//����һ�ֱ�����ʽ
		{
			System.out.println("res.getkey():"+res.getKey());
			System.out.println("res.getValue():"+res.getValue());
		}
		//����Iterator�ķ�ʽ����������set�ķ�ʽ������keySet����
		Set<String> result=hasMap.keySet();
		for(String result1:result){
			System.out.println("hasMap.get():"+hasMap.get(result1));
		}		
	}
	
}
