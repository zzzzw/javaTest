package equals;

/*public class equals {
	//�����������͸������������ͣ������������ͣ�,
	 //����������������equals��������д��һ�������Ƚ��ڴ��ַ
	public static void main(String args[])
	{
		String a="zengzhiwei";
		String b="zengzhiwei";//ָ��ͬһ������
		if(a==b)//�Ƚ��ڴ��ַ
		{
			System.out.println("a==b");			
		}
		else{
			System.out.println("a!=b");
		}
		if(a.equals(b))//�Ƚ�ֵ
		{
			System.out.println("a equals b");
		}
		else{
			System.out.println("a not equals b");
		}
		
	}
		*//**
	 * 		a==b
			a equals b
	 *//*

}*/
/*public class equals{
	public static  void main(String args[])
	{
		String a="zengzhiwei";
		String b=new String("zengzhiwei");
		if(a==b)//�Ƚ��ڴ��ַ
		{
			System.out.println("a==b");			
		}
		else{
			System.out.println("a!=b");
		}
		if(a.equals(b))//�Ƚ�ֵ
		{
			System.out.println("a equals b");
		}
		else{
			System.out.println("a not equals b");
		}
		
	}
	*//**
	 * 		a!=b
			a equals b
	 *//*
	

}*/
//���ڸ��������ݣ����û�и��ǣ���д��equals���������Ļ������ǱȽϵġ��ڴ��ַ��
public class equals{
	public static void main(String args[])
	{
		String a="zengzhiwei";
		String b=new String("zengzhiwei");
		b.intern();//����ַ��������Ƿ����"zengzhiwei"��ôһ���ַ�����������ڣ��ͷ��س�����ַ�����
				   //��������ڣ��÷����� ��"zengzhiwei"��ӵ��ַ������У�Ȼ���ٷ����������á�
		if(a==b)//�Ƚ��ڴ��
		{
			System.out.println("a==b");			
		}
		else{
			System.out.println("a!=b");
		}
		if(a.equals(b))//�Ƚ�ֵ
		{
			System.out.println("a equals b");
		}
		else{
			System.out.println("a not equals b");
		}
		
	}
	/***
	 * 	a!=b
		a equals b
		������
		http://www.cnblogs.com/zhxhdean/archive/2011/03/25/1995431.html#undefined
		���ǣ�˵ʲô�ڴ滺��ء������Ҽ���������Ч��
		s1 == s2
		s1 equals s2
	 */
}
