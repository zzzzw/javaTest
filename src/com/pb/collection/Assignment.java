package com.pb.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Assignment {
	public static void main(String args[])
	{
		//���屣��ѧ����Ϣ��List,Ԫ������ΪHashMap
		List<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧ������Ϣ,y��ʾ����,n��ʾ�˳�");
		while("y".equals(input.next())){
			HashMap<String,Object> map=new HashMap<String,Object>();
			System.out.println("������ѧ��:");
			map.put("studentno", input.next());
			System.out.println("����������:");
			map.put("name", input.next());
			System.out.println("����������");
			map.put("age", input.nextInt());
			list.add(map);
			System.out.println("���������ѧ������Ϣ��y��ʾ������n��ʾ�˳�");
		}
		System.out.println("�����ѧ����ϢΪ:");
		System.out.println("ѧ������Ϊ:"+list.size());
		
		Iterator<HashMap<String,Object>> it=list.iterator();
		int i=1;
		while(it.hasNext()){
			HashMap<String,Object> stuMap=it.next();
			System.out.println("��"+i+"��ѧ������ϢΪ");
			System.out.println("ѧ��"+stuMap.get("studentno")+",����:"+stuMap.get("name")+",����:"+stuMap.get("age"));
			i++;
		}
	}

}
