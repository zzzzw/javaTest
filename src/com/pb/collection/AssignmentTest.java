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
		//����һ��List<>�涨����������HashMap<String,Object>��ʵ�ֵ�ArrayList�����
		List<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
		//�ӿ���̨���붫��
		Scanner in=new Scanner(System.in);
		//��ʾ���
		System.out.println("����y����nѡ��y���Ǳ�ʾ��ʼ/����,n��ʾ�˳����߽���");
		//whileѭ��.in��һ��next()����
		while("y".equals(in.next())){
			/***
			 * ����Ҳ����д��
			 * HashMap<String,Object> map=new HashMap<String,Object>();
			 */
			
			Map<String,Object> map=new HashMap<String,Object>();
			System.out.println("����������");
			map.put("name", in.next());
			System.out.println("����������");
			map.put("age", in.next());
			System.out.println("�������Ա�boy  or  girl");
			map.put("sex", in.next());
			list.add((HashMap<String,Object>)map);
			//list.add(map); //��Ӧ��������һ��д��
			System.out.println("����y����������N����");//��ʾ�Ƿ��������ѭ��
		}
		Iterator<HashMap<String,Object>> it1=list.iterator();//����һ�������list��Ҳ��iterator()�����������ֱ��ʹ��
		/***
		 * ��һ�ַ�ʽ
		 */
		/*while(it1.hasNext())
		{
			
			*//***
			 * ��Ϊlist���洫������ֵ��HashMap<String,Object>,����������Ҫ�����HashMap<String,Object>,
			 * �Ҷ����String��object��������
			 * 
			 *//*
			HashMap<String,Object> key=it1.next();
			System.out.println(key.get("name"));//HashMap<String,Object> ��get()���������ͨ������ȥһ��keyȥ��ȡһ��value
			System.out.println(key.get("age"));
			System.out.println(key.get("sex"));
		}*/
		/***
		 * 
		 * �ڶ��ַ�ʽ
		 */
		for(HashMap<String,Object> list1:list){
			Set<String> set=list1.keySet();
			/*System.out.println(list1.get("name"));
			System.out.println(list1.get("age"));
			System.out.println(list1.get("sex"));*/
			for(String set1:set){
				//�����list1��Hash<String,Object>������list1.get��key������ȡ����value
				System.out.println(list1.get(set1)); 
			}
		}
	}

}
