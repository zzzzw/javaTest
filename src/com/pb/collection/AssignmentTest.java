package com.pb.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AssignmentTest {
	public static void main(String args[])
	{
		//定义一个List<>规定他的类型是HashMap<String,Object>，实现的ArrayList这个类
		List<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
		//从控制台输入东西
		Scanner in=new Scanner(System.in);
		//提示语句
		System.out.println("输入y或者n选择，y就是表示开始/继续,n表示退出或者结束");
		//while循环.in有一个next()方法
		while("y".equals(in.next())){
			/***
			 * 这里也可以写成
			 * HashMap<String,Object> map=new HashMap<String,Object>();
			 */
			
			Map<String,Object> map=new HashMap<String,Object>();
			System.out.println("请输入姓名");
			map.put("name", in.next());
			System.out.println("请输入年龄");
			map.put("age", in.next());
			System.out.println("请输入性别boy  or  girl");
			map.put("sex", in.next());
			list.add((HashMap<String,Object>)map);
			//list.add(map); //对应上面另外一种写法
			System.out.println("输入y继续或输入N结束");//提示是否继续进行循环
		}
		Iterator<HashMap<String,Object>> it1=list.iterator();//定义一个遍历里。list型也有iterator()这个方法可以直接使用
		/***
		 * 第一种方式
		 */
		/*while(it1.hasNext())
		{
			
			*//***
			 * 因为list里面传出来的值是HashMap<String,Object>,所以这里需要定义成HashMap<String,Object>,
			 * 我定义成String跟object都报错了
			 * 
			 *//*
			HashMap<String,Object> key=it1.next();
			System.out.println(key.get("name"));//HashMap<String,Object> 有get()这个方法。通过传进去一个key去获取一个value
			System.out.println(key.get("age"));
			System.out.println(key.get("sex"));
		}*/
		/***
		 * 
		 * 第二种方式
		 */
		for(HashMap<String,Object> list1:list){
			Set<String> set=list1.keySet();
			/*System.out.println(list1.get("name"));
			System.out.println(list1.get("age"));
			System.out.println(list1.get("sex"));*/
			for(String set1:set){
				//这里的list1是Hash<String,Object>，所有list1.get（key）来获取他的value
				System.out.println(list1.get(set1)); 
			}
		}
	}

}
